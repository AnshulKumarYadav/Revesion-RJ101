package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	public Employee findByCellPhone(String cellPhone);
	
}
