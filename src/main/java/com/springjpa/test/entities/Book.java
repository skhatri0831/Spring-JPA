package com.springjpa.test.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String author;
	private String bookName;
	private String genre;
	
	public Book(int id, String author, String bookName, String genre) {
		super();
		this.id = id;
		this.author = author;
		this.bookName = bookName;
		this.genre = genre;
	}
	
	
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}



	@Override
	public String toString() {
		return "Book [id=" + id + ", author=" + author + ", bookName=" + bookName + ", genre=" + genre + "]";
	}

	
	

}
