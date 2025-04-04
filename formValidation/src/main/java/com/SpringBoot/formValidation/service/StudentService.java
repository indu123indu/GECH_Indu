package com.SpringBoot.formValidation.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.formValidation.dto.StudentDTO;
import com.SpringBoot.formValidation.models.Student;
import com.SpringBoot.formValidation.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAge(studentDTO.getAge());
        student.setPassword(studentDTO.getPassword());
        studentRepository.save(student);
    }

    public List<StudentDTO> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students.stream().map(student -> {
            StudentDTO dto = new StudentDTO();
            dto.setName(student.getName());
            dto.setEmail(student.getEmail());
            dto.setAge(student.getAge());
            dto.setPassword(student.getPassword());
            return dto;
        }).collect(Collectors.toList());
    }
}
