package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name 
{
	private String name = "IamNeo!";
	@GetMapping("/name")
	public String myName()
	{
		return "Welcome " + name;
	}

}
