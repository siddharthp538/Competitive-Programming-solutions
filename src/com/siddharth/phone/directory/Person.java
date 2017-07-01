package com.siddharth.phone.directory;

import java.util.List;

public class Person {

	String name;

	public Person(String name, String dob, String phoneNumber, List<Address> address) {
		this.name = name;
		this.dob = dob;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	String dob;
	String phoneNumber;
	List<Address> address;
}
