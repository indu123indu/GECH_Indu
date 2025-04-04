package com.SpringBoot.formValidation.models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringBoot.formValidation.dto.StudentDTO;
import com.SpringBoot.formValidation.service.StudentService;

import jakarta.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    // Constructor Injection for StudentService
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // ✅ Home Page - Display all students
    @GetMapping({"", "/"})
    public String home(Model model) {
        List<StudentDTO> students = studentService.getAllStudents(); // Fetch students
        model.addAttribute("students", students);  // Pass to Thymeleaf
        return "home";
    }

    // ✅ Show Add Student Form
    @GetMapping("/add-student")
    public String addStudent(Model model) {
        model.addAttribute("studentDTO", new StudentDTO());
        return "add_student";  // HTML file name
    }

    // ✅ Handle Student Form Submission
    @PostMapping("/add-student")
    public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result) {
        if (result.hasErrors()) {
            return "add_student";  // Return form if errors exist
        }
        studentService.saveStudent(studentDTO);
        return "redirect:/";  // Redirect to home page
    }
}
