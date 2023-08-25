package com.Day4.demo_Day4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day4.demo_Day4.Entities.Student;
import com.Day4.demo_Day4.Repository.StudentRepo;

@Service
public class ApiService {
	@Autowired
	StudentRepo StudentRepository;
	
	public Student saveinfo(Student Studentdetails)
	{
		return StudentRepository.save(Studentdetails);
	}
	public List<Student> showinfo()
	{
		return StudentRepository.findAll();
	}
	public Optional<Student> sow(int id)
	{
		return StudentRepository.findById(id);
	}
	public String changeinfoid(int id,Student Studentdetails)
	{
		StudentRepository.saveAndFlush(Studentdetails);
		if(StudentRepository.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}
	}
	public void deleteid(int id)
	{
		StudentRepository.deleteById(id);
	}

}
