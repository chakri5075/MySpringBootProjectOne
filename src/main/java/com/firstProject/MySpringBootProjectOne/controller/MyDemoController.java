package com.firstProject.MySpringBootProjectOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/home")
public class MyDemoController {

	
	@GetMapping("/message")
	public ResponseEntity<String> myMessage() {
		String returnMessage = "Welcome to spring boot Demo project";
		return new ResponseEntity<>(returnMessage,HttpStatus.OK);
	}
}
