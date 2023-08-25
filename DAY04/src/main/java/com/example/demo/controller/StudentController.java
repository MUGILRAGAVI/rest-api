package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
       StudentService sser;
       
       @PostMapping("save")
       public StudentDetails add(@RequestBody StudentDetails ss)
       {
    	   return sser.saveinfo(ss);
       }
       @GetMapping("show")
       public List<StudentDetails>show()
       {
    	   return sser.showinfo();
       }
       @GetMapping("get/{id}")
       public Optional<StudentDetails>getinfo(@PathVariable int id)
       {
    	   return sser.sow(id);
       }
       @PutMapping("update/{id}")
       public String modifybyid(@PathVariable int id,@RequestBody StudentDetails ss)
   	{
   		return sser.changeinfoid(id,ss);
   	}
       @DeleteMapping("delete/{id}")
       public  void deletemyid(@PathVariable int id)
       {
      	  sser.deleteid(id);
       }
}
