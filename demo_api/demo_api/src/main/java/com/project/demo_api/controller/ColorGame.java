package com.project.demo_api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {
    @Value("${col}")
    private String color;

    @GetMapping("/clr")
    public String getColor() {
        return "My favorite color is " + color;
    }
}
