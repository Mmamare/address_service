package com.address.service.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.address.service.address_service.AddressService;
import com.address.service.repo.AddresRepo;

@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	AddresRepo addressRepo;
	
	@Override
	public Address saveUserAddress(Address address) {
		
		return addressRepo.save(address);
	}

	@Override
	public Address getAddress(String userName) {
		
		return addressRepo.findAddressByUserName(userName);
	}

	@Override
	public Address updateAddress(Address address, Long id) {
		
		return null;
	}

}
