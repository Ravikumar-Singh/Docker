package com.example.dockerk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String getdata()
	{
		return "Hello Ravi";
	}
}
