package com.address.service.entity;


import jakarta.persistence.*;

@Entity
public class Address {
	
	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String addressLine;
	private String city;
	private String state;
	private String zipcode;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressLine, String city, String state, String zipcode) {
		super();
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
