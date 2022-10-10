package com.app.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.Exception.UserException;
import com.app.Model.Employee;
import com.app.Repository.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public ResponseEntity<List<Employee>> findAllEmployees() {
		List<Employee> employees = employeeDAO.findAll();
		 return new ResponseEntity<List<Employee>>(employees,HttpStatus.FOUND);
		
	}

	@Override
	public ResponseEntity<Employee> findByIdEmployee(Integer id) {
		Optional<Employee> employeeOptional = employeeDAO.findById(id);
		if(employeeOptional.isPresent())
		{
			return new ResponseEntity<Employee>(employeeOptional.get(), HttpStatus.ACCEPTED);
		}
		throw new UserException("Employee Does not Exists with this id");
	}

	@Override
	public ResponseEntity<Employee> saveEmployee(Employee employee) {
		Employee existsEmployee = employeeDAO.findByCellPhone(employee.getCellPhone());
		if(existsEmployee==null) {
			 Employee newEmployee = employeeDAO.save(employee);
			return new ResponseEntity<Employee>(newEmployee, HttpStatus.CREATED);
		}
		throw new UserException("User not found with this mobile");
	}

	@Override
	public ResponseEntity<Employee> updateEmployee(Integer id, Employee employee) {
		Optional<Employee> existsEmployee  = employeeDAO.findById(id);
		if(id==employee.getEmployeeId() && existsEmployee.isPresent())
		{
			existsEmployee.get().setFirstName(employee.getFirstName());
			existsEmployee.get().setLastName(employee.getLastName());
			existsEmployee.get().setCellPhone(employee.getCellPhone());
			employeeDAO.save(existsEmployee.get());
			return new ResponseEntity<Employee>(existsEmployee.get(), HttpStatus.ACCEPTED);
		}
		throw new UserException("Employee not found");
	}

	@Override
	public ResponseEntity<String> deleteEmployee(Integer id) {
		Optional<Employee> empOptional = employeeDAO.findById(id);
		if(empOptional.isPresent())
		{
			employeeDAO.delete(empOptional.get());
			return new ResponseEntity<String>("Employee is deleted", HttpStatus.OK );
		}
		throw new UserException("Employee not found");
	}



}
