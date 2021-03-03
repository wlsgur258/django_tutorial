package com.a.b.dto;

import java.sql.Timestamp;

public class Member {
	private int bNo;
	private String bId;
	private String bPw;
	private String bName;
	private String bGender;
	private String bBirthday;
	private Timestamp bJoindate;
	private int bCash;

	public Member() {}

	public Member(int bNo, String bId, String bPw, 
			String bName, String bGender, String bBirthday, 
			Timestamp bJoindate, int bCash) {
		this.bNo = bNo;
		this.bId = bId;
		this.bPw = bPw;
		this.bName = bName;
		this.bGender = bGender;
		this.bBirthday = bBirthday;
		this.bJoindate = bJoindate;
		this.bCash = bCash;
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbPw() {
		return bPw;
	}

	public void setbPw(String bPw) {
		this.bPw = bPw;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbGender() {
		return bGender;
	}

	public void setbGender(String bGender) {
		this.bGender = bGender;
	}

	public String getbBirthday() {
		return bBirthday;
	}

	public void setbBirthday(String bBirthday) {
		this.bBirthday = bBirthday;
	}

	public Timestamp getbJoindate() {
		return bJoindate;
	}

	public void setbJoindate(Timestamp bJoindate) {
		this.bJoindate = bJoindate;
	}

	public int getbCash() {
		return bCash;
	}

	public void setbCash(int bCash) {
		this.bCash = bCash;
	}

	

}
