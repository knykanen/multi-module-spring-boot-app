package com.example.app2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ApplicationTwo {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationTwo.class, args);
    }
}

@RestController
@RequestMapping("/app2")
class AppTwoController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/test")
    public String test() {
        return value;
    }
}