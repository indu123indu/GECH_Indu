package EmployeeCRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import EmployeeCRUD.dto.EmployeeDTO;
import EmployeeCRUD.models.Employee;
import EmployeeCRUD.repository.EmployeeRepository;
import EmployeeCRUD.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeService employeeService, EmployeeRepository employeeRepository) {
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    // Home Page - Display list of employees
    @GetMapping({"", "/"})
    public String home(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "home";
    }

    // Add Employee Page
    @GetMapping("/add-employee")
    public String addEmployee(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        return "add_employee";
    }

    // Add Employee - Handle form submission and validation
    @PostMapping("/add-employee")
    public String addEmployee(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult result, Model model, RedirectAttributes attributes) {
        // Check if email already exists
        Employee existingEmployee = employeeRepository.findByEmail(employeeDTO.getEmail());
        if (existingEmployee != null) {
            result.addError(new FieldError("employeeDTO", "email", "Email is already registered"));
        }

        // Validate Image
        if (employeeDTO.getImage().isEmpty()) {
            result.addError(new FieldError("employeeDTO", "image", "Image is required"));
        }

        // If there are validation errors, return to the add_employee form
        if (result.hasErrors()) {
            return "add_employee";
        }

        // Handle Image Upload
        String imageName = null;
        if (!employeeDTO.getImage().isEmpty()) {
            try {
                String originalFilename = StringUtils.cleanPath(employeeDTO.getImage().getOriginalFilename());
                // Using relative path to store image
                Path uploadPath = Paths.get("src/main/resources/static/uploads/");
                
                // Ensure the directory exists
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);  // Create the directory if it doesn't exist
                }
                
                // Set the target file path
                Path targetLocation = uploadPath.resolve(originalFilename);
                
                // Copy the file to the target location
                Files.copy(employeeDTO.getImage().getInputStream(), targetLocation);
                
                // Set the image name to store in the database
                imageName = originalFilename;
            } catch (IOException e) {
                e.printStackTrace();
                result.addError(new FieldError("employeeDTO", "image", "Failed to upload image"));
                return "add_employee";
            }
        }

        // Save the employee, including the image name
        employeeDTO.setImageName(imageName);  // Assuming employeeDTO has a field to store the image name
        employeeService.saveEmployee(employeeDTO);
        attributes.addFlashAttribute("success", "Employee added successfully");
        return "redirect:/";
    }

    // Delete Employee
    @GetMapping("/emp-delete")
    public String deleteEmployee(@RequestParam Long id, RedirectAttributes attributes) {
        employeeService.deleteEmployee(id);
        attributes.addFlashAttribute("success", "Employee deleted successfully");
        return "redirect:/";
    }

    // Edit Employee Page
    @GetMapping("/emp-edit")
    public String editEmployee(@RequestParam Long id, Model model) {
        EmployeeDTO employeeDTO = employeeService.editEmployee(id);
        Employee employee = employeeRepository.findById(id).get();
        model.addAttribute("employeeDTO", employeeDTO);
        model.addAttribute("employee", employee);
        return "edit_employee";
    }

    // Edit Employee - Handle form submission for update
    @PostMapping("/edit-employee")
    public String updateEmployee(@Valid @ModelAttribute EmployeeDTO employeeDTO, BindingResult result, @RequestParam Long id, Model model, RedirectAttributes attributes) {
        Employee existingEmployee = employeeRepository.findByEmail(employeeDTO.getEmail());
        if (existingEmployee != null && existingEmployee.getId() != id) {
            result.addError(new FieldError("employeeDTO", "email", "Email is already registered"));
        }

        if (result.hasErrors()) {
            Employee employee = employeeRepository.findById(id).get();
            model.addAttribute("employee", employee);
            return "edit_employee";
        }

        // Handle Image Update
        String imageName = null;
        if (!employeeDTO.getImage().isEmpty()) {
            try {
                String originalFilename = StringUtils.cleanPath(employeeDTO.getImage().getOriginalFilename());
                // Using relative path to store image
                Path uploadPath = Paths.get("src/main/resources/static/uploads/");
                
                // Ensure the directory exists
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);  // Create the directory if it doesn't exist
                }
                
                // Set the target file path
                Path targetLocation = uploadPath.resolve(originalFilename);
                
                // Copy the file to the target location
                Files.copy(employeeDTO.getImage().getInputStream(), targetLocation);
                
                // Set the image name to store in the database
                imageName = originalFilename;
            } catch (IOException e) {
                e.printStackTrace();
                result.addError(new FieldError("employeeDTO", "image", "Failed to upload image"));
                return "edit_employee";
            }
        }

        // Update employee with new image name if applicable
        employeeDTO.setImageName(imageName);
        employeeService.updateEmployee(employeeDTO, id);
        attributes.addFlashAttribute("success", "Employee edited successfully");
        return "redirect:/";
    }
}
