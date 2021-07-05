package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Springdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdemo1Application.class, args);
	}
	@GetMapping("/")
	  public String getMsgName() {
	    return "Welcome Nilanjit!";
	  }
	@GetMapping("/hi")
	public String hello() {
		return "Hello";
	}
}
