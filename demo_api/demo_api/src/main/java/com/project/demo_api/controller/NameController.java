package com.project.demo_api.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @Value("${studentName}")
    private String name;

    @GetMapping("name")
    public String getName() {
        return "Welcome " + name + "!";
    }
}