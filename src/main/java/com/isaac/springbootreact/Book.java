package com.isaac.springbootreact;

public class Book {
	 private int id;
	 private String bookName;
	 
	 
	public Book(int id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	 
	 

}
