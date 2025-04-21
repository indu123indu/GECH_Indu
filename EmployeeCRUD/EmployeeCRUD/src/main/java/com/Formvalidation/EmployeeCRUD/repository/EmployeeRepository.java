package com.Formvalidation.EmployeeCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Formvalidation.EmployeeCRUD.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    Employee findByEmail(String email);
}
