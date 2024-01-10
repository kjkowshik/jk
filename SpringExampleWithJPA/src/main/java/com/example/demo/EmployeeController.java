package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:4200/")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getEmployeeList")
	public List<Employee> getEmployeeList()
	{
		List<Employee> list=employeeService.getEmployeeList();
		return list;
	}
	
	@GetMapping("getEmployeeDetails")
	public Employee getEmployeeDetails(@RequestParam("id") int id)
	{
		Employee emp=employeeService.getEmployeeDetails(id);
		return emp;
	}
	
	@PostMapping("createEmployeeDetails")
	public Employee createEmployeeDetails(@RequestBody Employee emp)
	{
		Employee dbemp=employeeService.createEmployeeDetails(emp);
		return dbemp;
	}
	
	@PutMapping("updateEmployeeDetails")
	public Employee updateEmployeeDetails(@RequestBody Employee emp)
	{
		Employee dbemp=employeeService.updateEmployeeDetails(emp);
		return dbemp;
	}

	@DeleteMapping("deleteEmployeeDetails")
	public String deleteEmployee(@RequestParam("id") int id)
	{
		String res=employeeService.deleteEmployee(id);
		return res;
	}
}
