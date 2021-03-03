package com.a.b.dto;

import java.sql.Timestamp;

public class RentalList {
	
	private int bRentalno;
	private String bId;
	private int bBookno;
	private Timestamp bRentaldate;
	
	public RentalList() {}

	public RentalList(int bRentalno, String bId, int bBookno, 
			Timestamp bRentaldate) {
		this.bRentalno = bRentalno;
		this.bId = bId;
		this.bBookno = bBookno;
		this.bRentaldate = bRentaldate;
	}

	public int getbRentalno() {
		return bRentalno;
	}

	public void setbRentalno(int bRentalno) {
		this.bRentalno = bRentalno;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public int getbBookno() {
		return bBookno;
	}

	public void setbBookno(int bBookno) {
		this.bBookno = bBookno;
	}

	public Timestamp getbRentaldate() {
		return bRentaldate;
	}

	public void setbRentaldate(Timestamp bRentaldate) {
		this.bRentaldate = bRentaldate;
	}

	
	
}
