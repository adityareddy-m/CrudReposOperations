package com.sample.usecase.attendanceapi.dataaccesslayer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.usecase.attendanceapi.dataentities.Employee;

@Repository
public interface AttendanceRepository extends CrudRepository<Employee, Integer>  {

}
