package com.vladancupric;

public class Address {
	private String street;
	private int postalCode;
	
	private Address() {
		
	}
	public Address(String street, int postalCode) {
		super();
		this.street = street;
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	

}
