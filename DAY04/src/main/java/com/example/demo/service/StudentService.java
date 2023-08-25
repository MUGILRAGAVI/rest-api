package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo sr;
	
	public StudentDetails saveinfo(StudentDetails ss)
	{
		return sr.save(ss);
	}
	public List<StudentDetails> showinfo()
	{
		return sr.findAll();
	}
	public Optional<StudentDetails> sow(int id)
	{
		return sr.findById(id);
	}
	public String changeinfoid(int id,StudentDetails ss)
	{
		sr.saveAndFlush(ss);
		if(sr.existsById(id))
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
		sr.deleteById(id);
	}
    
}
