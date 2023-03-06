package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class Display 
{
	@Value("${value.name}")
	private String name;
	@GetMapping("/name")
	public String homepage()
	{
		return name;
	}
}
