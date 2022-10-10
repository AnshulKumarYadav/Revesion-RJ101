package com.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.Exception.UserException;
import com.app.Model.Address;
import com.app.Model.Employee;
import com.app.Repository.AddressDAO;
import com.app.Repository.EmployeeDAO;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private AddressDAO addressDAO;

	@Override
	public ResponseEntity<List<Address>> getAllAddress(Integer empId) {
		Optional<Employee> empOptional = employeeDAO.findById(empId);
		if(empOptional.isPresent()) {
			List<Address> list = empOptional.get().getAddresses();
			return new ResponseEntity<List<Address>>(list, HttpStatus.FOUND);
		}
		throw new UserException("Employee not found with this id");
	}

	@Override
	public ResponseEntity<Address> getAddressById(Integer id, Integer empId) {
		Optional<Employee> empOptional = employeeDAO.findById(empId);
		
		if(empOptional.isPresent())
		{
			 Optional<Address> eOptional = addressDAO.findById(id);
			 return new ResponseEntity<Address>(eOptional.get(), HttpStatus.FOUND);
		}
		throw new UserException("Employee not found");
		
	}

	@Override
	public ResponseEntity<Employee> saveAddresss(Integer empid,Address e) {
       Optional<Employee> empOptional = employeeDAO.findById(empid);
		
		if(empOptional.isPresent())
		{
			 empOptional.get().getAddresses().add(e);
			 return new ResponseEntity<Employee>(empOptional.get(), HttpStatus.OK);
		}
		throw new UserException("Employee not found");
	}

	@Override
	public ResponseEntity<Employee> updateAddress(Integer empId, Integer id,Address a) {
        Optional<Employee> empOptional = employeeDAO.findById(empId);
		
		if(empOptional.isPresent())
		{
			 Optional<Address> eOptional = addressDAO.findById(id);
			 eOptional.get().setStreet(a.getStreet());
			 eOptional.get().setCity(a.getCity());
			 eOptional.get().setState(a.getState());
			 eOptional.get().setCountry(a.getCountry());
			 
			 addressDAO.save(eOptional.get());
			 return new ResponseEntity<Employee>(empOptional.get(), HttpStatus.ACCEPTED);
		}
		throw new UserException("Employee not found");
	}

	@Override
	public ResponseEntity<Employee> deleteAddress(Integer empId, Integer id) {
        Optional<Employee> empOptional = employeeDAO.findById(empId);
		
		if(empOptional.isPresent())
		{
			 Optional<Address> eOptional = addressDAO.findById(id);
			 addressDAO.delete(eOptional.get());
			 return new ResponseEntity<Employee>(empOptional.get(), HttpStatus.ACCEPTED);
		}
		throw new UserException("Employee not found");
	}

}
