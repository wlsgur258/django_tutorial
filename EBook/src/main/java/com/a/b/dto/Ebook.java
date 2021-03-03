package com.a.b.dto;

public class Ebook {
	
	private int bBookno;
	private String bBookname;
	private String bContent;
	private int bPrice;
	private String bWriter;
	private String bPublisher;
	private String bCategory;
	
	public Ebook() {}

	public Ebook(int bBookno, String bBookname, String bContent, 
				int bPrice, String bWriter, String bPublisher,
				String bCategory) {
		this.bBookno = bBookno;
		this.bBookname = bBookname;
		this.bContent = bContent;
		this.bPrice = bPrice;
		this.bWriter = bWriter;
		this.bPublisher = bPublisher;
		this.bCategory = bCategory;
	}

	public int getbBookno() {
		return bBookno;
	}

	public void setbBookno(int bBookno) {
		this.bBookno = bBookno;
	}

	public String getbBookname() {
		return bBookname;
	}

	public void setbBookname(String bBookname) {
		this.bBookname = bBookname;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public int getbPrice() {
		return bPrice;
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getbPublisher() {
		return bPublisher;
	}

	public void setbPublisher(String bPublisher) {
		this.bPublisher = bPublisher;
	}

	public String getbCategory() {
		return bCategory;
	}

	public void setbCategory(String bCategory) {
		this.bCategory = bCategory;
	}

}
