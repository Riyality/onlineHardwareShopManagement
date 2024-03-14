package com.jut.entity;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int id;
	private String name;
	private String mobileNo;

	public Customer(int id, String name, String mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public Customer() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}
