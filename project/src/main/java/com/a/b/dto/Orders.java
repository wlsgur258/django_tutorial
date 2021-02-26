package com.a.b.dto;

import java.sql.Timestamp;

public class Orders {

	private String orderid;
	private String id;
	private String bookid;
	private String price;
	private Timestamp orderdate;
	private String returndate;
	
	public Orders(String orderid, String id, String bookid, 
			String price, Timestamp orderdate, String returndate) {
		this.orderid = orderid;
		this.id = id;
		this.bookid = bookid;
		this.price = price;
		this.orderdate = orderdate;
		this.returndate = returndate;
		
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Timestamp getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Timestamp orderdate) {
		this.orderdate = orderdate;
	}
	
	public String getReturndate() {
		return returndate;
	}
	
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	
}
