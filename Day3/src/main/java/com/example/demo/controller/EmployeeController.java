package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeModel;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeRepository repository;
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/get")
	List<EmployeeModel> getList()
	{
		return repository.findAll();
	}
	
	@PostMapping("/post")
	public EmployeeModel create(@RequestBody EmployeeModel stut)
	{
		return repository.save(stut);
	}
	
	@GetMapping("/getvalues/{id}")
	public Optional<EmployeeModel> getbyid(@PathVariable int id)
	{
		return service.getStudent(id);
	}
}
