package com.example.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	class SimpleRestController{
		
		@GetMapping("/")
		public String home() {
			return "Applications deployée 🎉";
		}
		
		@GetMapping(path = "/sante")
		public String sante() {
			return "I feel gool ✅";
		}
	}
}
