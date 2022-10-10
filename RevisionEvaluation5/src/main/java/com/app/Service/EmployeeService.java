package com.app.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.Model.Employee;

public interface EmployeeService {
	
	public ResponseEntity<List<Employee>> findAllEmployees();
	
	public ResponseEntity<Employee> findByIdEmployee(Integer id);
	
	public ResponseEntity<Employee> saveEmployee(Employee employee);
	
	public ResponseEntity<Employee> updateEmployee(Integer id,Employee employee);
	
	public ResponseEntity<String> deleteEmployee(Integer id);
	


}
