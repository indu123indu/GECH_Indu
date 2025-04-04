package com.Student.RegistrationForm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Student.RegistrationForm.models.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
