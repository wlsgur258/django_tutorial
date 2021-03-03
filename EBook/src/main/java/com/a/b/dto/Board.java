package com.a.b.dto;

import java.sql.Timestamp;

public class Board {

	private int bBid;
	private String bId;
	private String bTitle;
	private String bContent;
	private String bCategory;
	private Timestamp bDate;
	private String bHit;
	private String bGroup;
	private String bStep;
	private String bIndent;
	
	public Board() {}

	public Board(int bBid, String bId, String bTitle, String bContent, 
			String bCategory, Timestamp bDate, String bHit,
			String bGroup, String bStep, String bIndent) {
		this.bBid = bBid;
		this.bId = bId;
		this.bTitle = bTitle;
		this.bContent = bContent;
		this.bCategory = bCategory;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
	}

	public int getbBid() {
		return bBid;
	}

	public void setbBid(int bBid) {
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

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
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

	public String getbGroup() {
		return bGroup;
	}

	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
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
	
}