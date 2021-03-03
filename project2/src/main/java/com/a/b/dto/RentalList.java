package com.a.b.dto;

import java.sql.Timestamp;

public class RentalList {
	
	private String bRentalno;
	private String bId;
	private String bBookno;
	private Timestamp bRentaldate;
	
	public RentalList() {}

	public RentalList(String bRentalno, String bId, String bBookno, 
			Timestamp bRentaldate) {
		this.bRentalno = bRentalno;
		this.bId = bId;
		this.bBookno = bBookno;
		this.bRentaldate = bRentaldate;
	}

	public String getbRentalno() {
		return bRentalno;
	}

	public void setbRentalno(String bRentalno) {
		this.bRentalno = bRentalno;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbBookno() {
		return bBookno;
	}

	public void setbBookno(String bBookno) {
		this.bBookno = bBookno;
	}

	public Timestamp getbRentaldate() {
		return bRentaldate;
	}

	public void setbRentaldate(Timestamp bRentaldate) {
		this.bRentaldate = bRentaldate;
	}

	
	
}
