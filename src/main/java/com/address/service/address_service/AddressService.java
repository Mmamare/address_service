package com.address.service.address_service;

import com.address.service.entity.Address;

public interface AddressService {
	Address saveUserAddress(Address address);
	Address getAddress(String userName);
	Address updateAddress(Address address, Long id);
}
