package com.github.jodiew.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/spring-hello")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
