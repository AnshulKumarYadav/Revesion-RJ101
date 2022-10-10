package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Model.Address;

public interface AddressDAO extends JpaRepository<Address, Integer>{

}
