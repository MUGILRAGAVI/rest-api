package com.Day4.demo_Day4.Controller;

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

import com.Day4.demo_Day4.Entities.Student;
import com.Day4.demo_Day4.Service.ApiService;

@RestController
public class ApiController {
	@Autowired
    ApiService StudentApiservice;
    
    @PostMapping("save")
    public Student add(@RequestBody Student Studentdetails)
    {
 	   return StudentApiservice.saveinfo(Studentdetails);
    }
    @GetMapping("show")
    public List<Student>show()
    {
 	   return StudentApiservice.showinfo();
    }
    @GetMapping("get/{id}")
    public Optional<Student>getinfo(@PathVariable int id)
    {
 	   return StudentApiservice.sow(id);
    }
    @PutMapping("update/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody Student Studentdetails)
	{
		return StudentApiservice.changeinfoid(id,Studentdetails);
	}
    @DeleteMapping("delete/{id}")
    public  void deletemyid(@PathVariable int id)
    {
    	StudentApiservice.deleteid(id);
    }

}
