package com.app.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.Model.Address;
import com.app.Model.Employee;

public interface AddressService {
	
	public ResponseEntity<List<Address>> getAllAddress(Integer empId);
	
	public ResponseEntity<Address> getAddressById(Integer id,Integer empId);
	
	public ResponseEntity<Employee> saveAddresss(Integer empid, Address a);
	
	public ResponseEntity<Employee> updateAddress(Integer empId,Integer id,Address a);
	
	public ResponseEntity<Employee> deleteAddress(Integer empId, Integer id);
	

}
