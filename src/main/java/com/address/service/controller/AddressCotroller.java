package com.address.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import com.address.service.address_service.AddressService;
import com.address.service.entity.Address;

@RestController("amazon/user_address/")
public class AddressCotroller {
	@Autowired
	AddressService addressService;
	
	@PostMapping("saveaddress")
	public Address saveAddress(@RequestBody Address address) {
		Address userAddress = addressService.saveUserAddress(address);
		return address;
	}
	
	@GetMapping("username")
	public Address getUserAddress(String name) {
		return addressService.getAddress(name);
	}

}
