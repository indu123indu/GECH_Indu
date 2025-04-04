package com.SpringBoot.formValidation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.formValidation.models.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {

}
