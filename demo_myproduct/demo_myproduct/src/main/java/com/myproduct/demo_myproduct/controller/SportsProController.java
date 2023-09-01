package com.myproduct.demo_myproduct.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproduct.demo_myproduct.entities.ProductEntities;
import com.myproduct.demo_myproduct.service.SportsProService;

@RestController
public class SportsProController {
			Logger logger = LoggerFactory.getLogger(SportsProController.class);
	@GetMapping(path="/loggerdemo")
		public String loggerDemo() {
			logger.info("Logger info");
			logger.warn("Logger warn");
			logger.error("logger error");
			return "Hello from logger demo";
		}
	@Autowired
	SportsProService sportsproservice;
	@PostMapping("save")
	public ProductEntities add(@RequestBody ProductEntities productentities)
	{
		return sportsproservice.saveinfo(productentities);
	}
	@GetMapping("show")
	public List<ProductEntities>show()
	{
		return sportsproservice.showinfo();
	}
	@GetMapping("get/{id}")
    public Optional<ProductEntities>getinfo(@PathVariable int id)
    {
		
 	   return sportsproservice.sow(id);
    }
    @PutMapping("update/{id}")
    public String modifybyid(@PathVariable int id,@RequestBody ProductEntities productentities)
	{
		return sportsproservice.changeinfoid(id,productentities);
	}
    @DeleteMapping("delete/{id}")
    public  void deletemyid(@PathVariable int id)
    {
   	  sportsproservice.deleteid(id);
    }
    @GetMapping("sort/{name}")
    public List<ProductEntities> getSort(@PathVariable String name)
    {
    	return sportsproservice.sortinfo(name);
    }
    @GetMapping("{pageno}/{pagesize}")
    public List<ProductEntities> showpageinfo(@PathVariable int pageno, @PathVariable int pagesize)
    {
    	return sportsproservice.getbypage(pageno,pagesize);
    }
}


