package com.project.demo_api.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
@GetMapping("color")
   public String welcome() {
	return "Welcome";
}
}

