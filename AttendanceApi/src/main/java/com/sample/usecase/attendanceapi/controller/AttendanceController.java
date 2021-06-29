package com.sample.usecase.attendanceapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.usecase.attendanceapi.dataentities.Employee;
import com.sample.usecase.attendanceapi.services.AttendaceService;


@RestController
@RequestMapping("/attendanceapi")
public class AttendanceController {
	
	@Autowired
	private AttendaceService aService;
	
	@PostMapping("/")
	public Employee addEmployee(@RequestBody Employee emp) {
		aService.createEmployee(emp);
		return emp;
	}
	
	@GetMapping
	public Iterable<Employee> getAllEmps(){
		return aService.getAllEmployees();
	}
	
	@GetMapping({"id"})
	public Optional<Employee> getEmpById(@PathVariable Integer id){
		return aService.getById(id);
	}
	
	@DeleteMapping("{id}")
	public Iterable<Employee> deleteEmpById(@PathVariable("id") Integer id){
		return aService.deleteById(id);

	}
	@PutMapping
	public void update(@RequestBody Employee emp1) {
		aService.update(emp1);
	}

}
