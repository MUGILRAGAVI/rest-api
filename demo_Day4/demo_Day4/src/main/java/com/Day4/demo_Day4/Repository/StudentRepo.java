package com.Day4.demo_Day4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day4.demo_Day4.Entities.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
