package com.Formvalidation.EmployeeCRUD.Controller.copy;

import com.Formvalidation.EmployeeCRUD.dto.EmployeeDTO;
import com.Formvalidation.EmployeeCRUD.models.Employee;
import com.Formvalidation.EmployeeCRUD.service.EmployeeService;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // Home Page - List all employees
    @GetMapping("/")
    public String home(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "home";
    }

    // Add Employee Page
    @GetMapping("/add-employee")
    public String addForm(Model model) {
        model.addAttribute("employeeDTO", new EmployeeDTO());
        return "add-employee";
    }
    @PostMapping("/add-employee")
    public String addEmployee(@ModelAttribute("employeeDTO") EmployeeDTO employeeDTO,
                              @RequestParam("image") MultipartFile imageFile,
                              @RequestParam("document") MultipartFile documentFile) {
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/";
    }


    // Save Employee
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute EmployeeDTO employeeDTO) {
        employeeService.saveEmployee(employeeDTO);
        return "redirect:/";
    }

    // Edit Employee Page using @RequestParam
    @GetMapping("/edit")
    public String editForm(@RequestParam("id") Long id, Model model) {
        EmployeeDTO employeeDTO = employeeService.editEmployee(id);
        model.addAttribute("employeeDTO", employeeDTO);
        model.addAttribute("employeeId", id);
        return "edit";
    }

    // Update Employee using @RequestParam
    @PostMapping("/update")
    public String updateEmployee(@RequestParam("id") Long id, @ModelAttribute EmployeeDTO employeeDTO) {
        employeeService.updateEmployee(employeeDTO, id);
        return "redirect:/";
    }

    // Delete Employee using @RequestParam
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }

    // Serve uploaded documents
    @GetMapping("/documents/{filename}")
    @ResponseBody
    public ResponseEntity<Resource> serveDocument(@PathVariable String filename) throws IOException {
        Path path = Paths.get("uploads").resolve(filename);
        Resource resource = new UrlResource(path.toUri());

        if (!resource.exists() || !resource.isReadable()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
                .body(resource);
    }
}
