package com.a.b.dto;

import java.sql.Timestamp;

public class RentalingList {

	private String bRentalno;
	private String bId;
	private String bBookno;
	private Timestamp bRentaldate;
	private String bReturndate;
	
	public RentalingList() {}

	public RentalingList(String bRentalno, String bId, String bBookno, Timestamp bRentaldate, 
			String bReturndate) {
		this.bRentalno = bRentalno;
		this.bId = bId;
		this.bBookno = bBookno;
		this.bRentaldate = bRentaldate;
		this.bReturndate = bReturndate;
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

	public String getbReturndate() {
		return bReturndate;
	}

	public void setbReturndate(String bReturndate) {
		this.bReturndate = bReturndate;
	}
	
	
	
}
