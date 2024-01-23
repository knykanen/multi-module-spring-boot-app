package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.example.app1", "com.example.app2"}
)
public class ParentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParentApplication.class, args);
	}
}
