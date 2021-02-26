package com.a.b.dto;

public class Book {
	
	private String bookid;
	private String bookname;
	private String writer;
	private String publisher;
	private String price;
	
	public Book() {}

	public Book(String bookid, String bookname, 
				String writer, String publisher, String price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
