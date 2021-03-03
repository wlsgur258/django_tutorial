package com.a.b.dto;

import java.sql.Timestamp;

public class RentalingList {

	private int bRentalno;
	private String bId;
	private int bBookno;
	private Timestamp bRentaldate;
	private String bReturndate;
	
	public RentalingList() {}

	public RentalingList(int bRentalno, String bId, int bBookno, Timestamp bRentaldate, 
			String bReturndate) {
		this.bRentalno = bRentalno;
		this.bId = bId;
		this.bBookno = bBookno;
		this.bRentaldate = bRentaldate;
		this.bReturndate = bReturndate;
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

	public String getbReturndate() {
		return bReturndate;
	}

	public void setbReturndate(String bReturndate) {
		this.bReturndate = bReturndate;
	}
	
	
	
}
