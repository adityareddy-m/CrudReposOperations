package com.sample.usecase.attendanceapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.usecase.attendanceapi.dataaccesslayer.AttendanceRepository;
import com.sample.usecase.attendanceapi.dataaccesslayer.AttendanceRepository1;
import com.sample.usecase.attendanceapi.dataentities.Employee;


@Service
public class AttendaceService {

	@Autowired
	private AttendanceRepository1 aRepository;
	//private AttendanceRepository aRepository;
	
	/*
	public void createEmployee(Employee emp) { 
		aRepository.save(emp);
	}
	
	public Iterable<Employee> getAllEmployees() {
		return aRepository.findAll();
	}
	
	public Iterable<Employee> deleteById(Integer id) {
		 aRepository.deleteById(id);
		 return getAllEmployees();
	}
	
	public void  update(Employee emp) {
		aRepository.save(emp);
	}

	public Optional<Employee> getById(Integer id) {
		return aRepository.findById(id);
	}
	*/
	public void createEmployee(Employee emp) { 
		aRepository.save(emp);
	}
	
	public Iterable<Employee> getAllEmployees() {
		return aRepository.findAll();
	}
	
	public Iterable<Employee> deleteById(Integer id) {
		 aRepository.deleteById(id);
		 return getAllEmployees();
	}
	
	public void  update(Employee emp) {
		aRepository.save(emp);
	}

	public Optional<Employee> getById(Integer id) {
		return aRepository.findById(id);
	}
	
}
