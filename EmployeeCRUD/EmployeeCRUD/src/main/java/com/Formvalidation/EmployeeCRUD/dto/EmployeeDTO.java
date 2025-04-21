package com.Formvalidation.EmployeeCRUD.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {

    @NotBlank(message = "Employee name is required")
    private String name;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Minimum age must be 18")
    private Integer age;

    @NotBlank(message = "Employee email is required")
    @Email(message = "Please enter a valid email")
    private String email;

    @NotBlank(message = "Employee password is required")
    private String password;

    private MultipartFile image;      // Profile picture
    private MultipartFile document;   // Resume or supporting document

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public MultipartFile getDocument() {
        return document;
    }

    public void setDocument(MultipartFile document) {
        this.document = document;
    }
}
