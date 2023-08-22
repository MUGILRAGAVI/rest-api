package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.EmployeeModel;

@RestController
public class EmployeeControl {

	@Autowired
	EmployeeService es;
	
	@PostMapping("addemp")
	public EmployeeModel add(@RequestBody EmployeeModel em) {
		return es.showInfo(em);
	}
	
	@GetMapping("/showdet")
	public List<EmployeeModel> show()
	{
		return es.getInfo();
	}
}
