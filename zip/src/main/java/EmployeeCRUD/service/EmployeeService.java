package EmployeeCRUD.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import EmployeeCRUD.dto.EmployeeDTO;
import EmployeeCRUD.models.Employee;
import EmployeeCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(EmployeeDTO employeeDTO) {
        MultipartFile image = employeeDTO.getImage();
        MultipartFile document = employeeDTO.getDocument();
        Date createdDate = new Date();

        // Handling image upload
        String storeImageName = createdDate.getTime() + "_" + image.getOriginalFilename();
        String uploadDir = "public/images/";

        try {
            // Ensure the image directory exists
            Path uploadPath = Paths.get(uploadDir);
            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            InputStream inputStream = image.getInputStream();
            Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Handling document upload (PDF)
        String storeDocumentName = createdDate.getTime() + "_" + document.getOriginalFilename();
        String documentDir = "public/documents/";

        try {
            // Ensure the documents directory exists
            Path documentPath = Paths.get(documentDir);
            if (!Files.exists(documentPath)) {
                Files.createDirectories(documentPath);
            }

            InputStream inputStream = document.getInputStream();
            Files.copy(inputStream, Paths.get(documentDir + storeDocumentName), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Saving the employee to the database
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPassword(employeeDTO.getPassword());
        employee.setImagePath(storeImageName);
        employee.setDocumentPath(storeDocumentName);

        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        
        // Delete image
        String uploadDir = "public/images/";
        Path imagePath = Paths.get(uploadDir + employee.getImagePath());
        try {
            Files.delete(imagePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Delete document
        String documentDir = "public/documents/";
        Path documentPath = Paths.get(documentDir + employee.getDocumentPath());
        try {
            Files.delete(documentPath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        employeeRepository.delete(employee);
    }

    public EmployeeDTO editEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employee.getName());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPassword(employee.getPassword());
        return employeeDTO;
    }

    public void updateEmployee(EmployeeDTO employeeDTO, Long id) {
        Employee employee = employeeRepository.findById(id).get();
        
        if (!employeeDTO.getImage().isEmpty()) {
            Path oldImagePath = Paths.get("public/images/" + employee.getImagePath());
            try {
                Files.delete(oldImagePath);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            MultipartFile image = employeeDTO.getImage();
            String storeImageName = new Date().getTime() + "_" + image.getOriginalFilename();
            String uploadDir = "public/images/";

            try {
                InputStream inputStream = image.getInputStream();
                Files.copy(inputStream, Paths.get(uploadDir + storeImageName), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            employee.setImagePath(storeImageName);
        }

        if (!employeeDTO.getDocument().isEmpty()) {
            Path oldDocumentPath = Paths.get("public/documents/" + employee.getDocumentPath());
            try {
                Files.delete(oldDocumentPath);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            MultipartFile document = employeeDTO.getDocument();
            String storeDocumentName = new Date().getTime() + "_" + document.getOriginalFilename();
            String documentDir = "public/documents/";

            try {
                InputStream inputStream = document.getInputStream();
                Files.copy(inputStream, Paths.get(documentDir + storeDocumentName), StandardCopyOption.REPLACE_EXISTING);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            employee.setDocumentPath(storeDocumentName);
        }

        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPassword(employeeDTO.getPassword());
        employeeRepository.save(employee);
    }
}
