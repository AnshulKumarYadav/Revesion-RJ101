package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.Address;
import com.app.Model.Employee;
import com.app.Service.AddressServiceImpl;

@RestController
@RequestMapping("/employees")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl addressServiceImpl;
	
	@GetMapping("/{empId}")
	public ResponseEntity<List<Address>> getAllAddress(@PathVariable("empId") Integer empId)
	{
		return addressServiceImpl.getAllAddress(empId);
	}
	
	@GetMapping("/{empId}/address/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable("empId") Integer empId,@PathVariable("id") Integer id)
	{
		return addressServiceImpl.getAddressById(id, empId);
	}
	
	@PostMapping("/{empId}/address")
	public ResponseEntity<Employee> createAddress(@PathVariable("empId") Integer empId, @RequestBody Address address)
	{
		return addressServiceImpl.saveAddresss(empId, address);
	}
	
	@PutMapping("/{empId}/address/{id}")
	public ResponseEntity<Employee> updateAddress(@PathVariable("empId") Integer empId, @PathVariable("id") Integer id, @RequestBody Address address)
	{
		return addressServiceImpl.updateAddress(empId, id, address);
	}
	
	@DeleteMapping("/{empId}/address/{id}")
	public ResponseEntity<Employee> deleteAddress(@PathVariable("empId") Integer empId,@PathVariable("id") Integer id)
	{
		return addressServiceImpl.deleteAddress(empId, id);
	}
	
}
