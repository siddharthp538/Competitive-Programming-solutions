package com.siddharth.phone.directory;

public class Address {

	String street;

	public Address(String street, int roomNum, String buildingName) {
		this.street = street;
		this.roomNum = roomNum;
		this.buildingName = buildingName;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", roomNum=" + roomNum + ", buildingName=" + buildingName + "]";
	}

	int roomNum;
	String buildingName;

}
