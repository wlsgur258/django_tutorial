package com.a.b.dto;

import java.sql.Timestamp;

public class Customer {
	private String no; 
	private String id; 
	private String password; 
	private Timestamp joindate;	
	private String address;
	private String phone;
	private String iswithrew;
	
	public Customer() {}
	
	public Customer(String no, String id, String password, Timestamp joindate, String address, String phone, String iswithrew) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.joindate = joindate;
		this.address = address;
		this.phone = phone;
		this.iswithrew = iswithrew;
	}

	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getIswithrew() {
		return iswithrew;
	}
	public void setIswithrew(String iswithrew) {
		this.iswithrew = iswithrew;
	}
	
	
}
