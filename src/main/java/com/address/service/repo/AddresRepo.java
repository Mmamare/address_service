package com.address.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.address.service.entity.Address;

@Repository
public interface AddresRepo extends JpaRepository<Address, Long > {
	Address findAddressByUserName(String name);
	
}
