package com.sample.usecase.attendanceapi.dataaccesslayer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.usecase.attendanceapi.dataentities.Employee;

public interface AttendanceRepository1 extends JpaRepository<Employee, Integer> {

}
