package com.app.model;

public class Book {
	private int id,count;
	private String bookName,author,genre;
	
	
	public Book() {
		super();
	}


	public Book(int id, int count, String bookName, String author, String genre) {
		super();
		this.id = id;
		this.count = count;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
	}


	public int getId() {
		return id;
	}


	public int getCount() {
		return count;
	}


	public String getBookName() {
		return bookName;
	}


	public String getAuthor() {
		return author;
	}


	public String getGenre() {
		return genre;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
}
