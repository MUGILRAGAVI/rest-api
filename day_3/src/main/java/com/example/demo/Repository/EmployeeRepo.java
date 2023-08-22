package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EmployeeModel;

public interface EmployeeRepo extends JpaRepository<EmployeeModel, Integer>{

}
