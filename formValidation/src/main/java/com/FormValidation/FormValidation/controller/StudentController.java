package com.FormValidation.FormValidation.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.FormValidation.FormValidation.dto.StudentDTO;
import com.FormValidation.FormValidation.models.Student;
import com.FormValidation.FormValidation.repository.StudentRepository;
import com.FormValidation.FormValidation.service.StudentService;

import jakarta.validation.Valid;

@Controller
public class StudentController {

    private final StudentService studentService;
    private final StudentRepository studentRepository;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }

    // Home Page - Display list of students
    @GetMapping({"", "/"})
    public String home(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "home";
    }

    // Add Student Page
    @GetMapping("/add-student")
    public String addStudent(Model model) {
        model.addAttribute("studentDTO", new StudentDTO());
        return "add_student";
    }

    // Add Student - Handle form submission and validation
    @PostMapping("/add-student")
    public String addStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, Model model, RedirectAttributes attributes) {
        // Check if email already exists
        Student student = studentRepository.findByEmail(studentDTO.getEmail());
        if (student!= null) {
            result.addError(new FieldError("studentDTO", "email", "Email is already registered"));
        }

        // Validate Image and Document
        if (studentDTO.getImage().isEmpty()) {
            result.addError(new FieldError("studentDTO", "image", "Image is required"));
        }
        if (studentDTO.getDocument().isEmpty()) {
            result.addError(new FieldError("studentDTO", "document", "Document is required"));
        }

        if (result.hasErrors()) {
            return "add_student";
        }

        studentService.saveStudent(studentDTO);
        attributes.addFlashAttribute("success", "Student added successfully");
        return "redirect:/";
    }

    // Delete Student
    @GetMapping("/std-delete")
    public String deleteStudent(@RequestParam("id") Long id, RedirectAttributes attributes) {
        studentService.deleteStudent(id);
        attributes.addFlashAttribute("success", "Student deleted successfully");
        return "redirect:/";
    }

    // Edit Student Page
    @GetMapping("/std-edit")
    public String editStudent(@RequestParam("id") Long id, Model model) {
        StudentDTO studentDTO = studentService.editStudent(id);
        Student student = studentRepository.findById(id).orElse(null);

        if (student == null) {
            model.addAttribute("error", "Student not found");
            return "redirect:/";
        }

        model.addAttribute("studentDTO", studentDTO);
        model.addAttribute("student", student);
        return "edit_student";
    }

    // Edit Student - Handle form submission
    @PostMapping("/edit-student")
    public String updateStudent(@Valid @ModelAttribute StudentDTO studentDTO, BindingResult result, @RequestParam("id") Long id, Model model, RedirectAttributes attributes) {
        // Check if the email belongs to another student
        Student Student1 = studentRepository.findByEmail(studentDTO.getEmail());
        if (Student1 != null) {
            result.addError(new FieldError("studentDTO", "email", "Email is already registered by another student"));
        }
    	
    	if (result.hasErrors()) {
            Student student = studentRepository.findById(id).orElse(null);
            model.addAttribute("student", student);
            return "edit_student";
        }

        studentService.updateStudent(studentDTO, id);
        attributes.addFlashAttribute("success", "Student edited successfully");
        return "redirect:/";
    }
}