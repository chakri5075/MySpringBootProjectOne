package com.firstProject.MySpringBootProjectOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.Value;

@SpringBootApplication
public class MySpringBootProjectOneApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootProjectOneApplication.class, args);
	}
	
	@PostConstruct
	private void getMessage() {
		System.out.println("post construct message");
		
	}

}
