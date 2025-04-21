package com.Formvalidation.EmployeeCRUD.service;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.*;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Formvalidation.EmployeeCRUD.dto.EmployeeDTO;
import com.Formvalidation.EmployeeCRUD.models.Employee;
import com.Formvalidation.EmployeeCRUD.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    private static final String IMAGE_DIR = "src/main/resources/static/images/";
    private static final String DOCUMENT_DIR = "src/main/resources/static/documents/";

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(EmployeeDTO employeeDTO) {
        MultipartFile image = employeeDTO.getImage();
        MultipartFile document = employeeDTO.getDocument();

        String storeImageName = "";
        String storeDocumentName = "";

        try {
            storeImageName = saveFile(image, IMAGE_DIR);
        } catch (Exception e) {
            logger.error("Image Upload Error: ", e);
        }

        try {
            storeDocumentName = saveFile(document, DOCUMENT_DIR);
        } catch (Exception e) {
            logger.error("Document Upload Error: ", e);
        }

        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPassword(employeeDTO.getPassword());
        employee.setImagePath("/images/" + storeImageName);
        employee.setDocumentPath("/documents/" + storeDocumentName);

        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        try {
            Files.deleteIfExists(Paths.get(IMAGE_DIR + Paths.get(employee.getImagePath()).getFileName()));
        } catch (IOException e) {
            logger.error("Image Deletion Error: ", e);
        }

        try {
            Files.deleteIfExists(Paths.get(DOCUMENT_DIR + Paths.get(employee.getDocumentPath()).getFileName()));
        } catch (IOException e) {
            logger.error("Document Deletion Error: ", e);
        }

        employeeRepository.delete(employee);
    }

    public EmployeeDTO editEmployee(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setName(employee.getName());
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setEmail(employee.getEmail());
        employeeDTO.setPassword(employee.getPassword());

        return employeeDTO;
    }

    public void updateEmployee(EmployeeDTO employeeDTO, Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        if (!employeeDTO.getImage().isEmpty()) {
            try {
                Files.deleteIfExists(Paths.get(IMAGE_DIR + Paths.get(employee.getImagePath()).getFileName()));
                String newImageName = saveFile(employeeDTO.getImage(), IMAGE_DIR);
                employee.setImagePath("/images/" + newImageName);
            } catch (Exception e) {
                logger.error("Image Update Error: ", e);
            }
        }

        if (!employeeDTO.getDocument().isEmpty()) {
            try {
                Files.deleteIfExists(Paths.get(DOCUMENT_DIR + Paths.get(employee.getDocumentPath()).getFileName()));
                String newDocumentName = saveFile(employeeDTO.getDocument(), DOCUMENT_DIR);
                employee.setDocumentPath("/documents/" + newDocumentName);
            } catch (Exception e) {
                logger.error("Document Update Error: ", e);
            }
        }

        employee.setName(employeeDTO.getName());
        employee.setAge(employeeDTO.getAge());
        employee.setEmail(employeeDTO.getEmail());
        employee.setPassword(employeeDTO.getPassword());

        employeeRepository.save(employee);
    }

    private String saveFile(MultipartFile file, String dirPath) throws IOException {
        if (file.isEmpty()) return null;

        String fileName = new Date().getTime() + "_" + file.getOriginalFilename();
        Path uploadPath = Paths.get(dirPath);
        if (!Files.exists(uploadPath)) {
            Files.createDirectories(uploadPath);
        }
        try (InputStream inputStream = file.getInputStream()) {
            Files.copy(inputStream, uploadPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
        }
        return fileName;
    }
}
