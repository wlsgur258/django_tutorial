package com.a.b.dto;

import java.sql.Timestamp;

public class Board {

	private String bBid;
	private String bId;
	private String bTitle;
	private String bContent;
	private Timestamp bDate;
	private String bHit;
	private String bGoup;
	private String bStep;
	private String bIndent;
	private String bCategory;
	
	public Board() {}

	public Board(String bBid, String bId, String bTitle, String bContent, 
			Timestamp bDate, String bHit, String bGoup,
			String bStep, String bIndent, String bCategory) {
		this.bBid = bBid;
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGoup = bGoup;
		this.bStep = bStep;
		this.bIndent = bIndent;
		this.bCategory = bCategory;
	}

	public String getbBid() {
		return bBid;
	}

	public void setbBid(String bBid) {
		this.bBid = bBid;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public String getbHit() {
		return bHit;
	}

	public void setbHit(String bHit) {
		this.bHit = bHit;
	}

	public String getbGoup() {
		return bGoup;
	}

	public void setbGoup(String bGoup) {
		this.bGoup = bGoup;
	}

	public String getbStep() {
		return bStep;
	}

	public void setbStep(String bStep) {
		this.bStep = bStep;
	}

	public String getbIndent() {
		return bIndent;
	}

	public void setbIndent(String bIndent) {
		this.bIndent = bIndent;
	}

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}

	
	
}