package com.SpringBoot.formValidation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {

    @NotBlank(message = "Student name cannot be empty")
    private String name;

    @Min(value = 10, message = "Age must be at least 10 years")
    private int age;

    @NotBlank(message = "Student email cannot be empty")
    @Email(message = "Enter a valid email address")
    private String email;

    @NotBlank(message = "Password cannot be empty")
    private String password;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
