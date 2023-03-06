package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color 
{
	private String color = "Blue";
	@GetMapping("/color")
	public String myColor()
	{
		return "My Favourite color is " + color;
	}
}
