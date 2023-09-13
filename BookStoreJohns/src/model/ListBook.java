package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// create the database table
@Entity
@Table(name = "Books")
public class ListBook {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "author")
	private String author;

	// create the constructor
	public ListBook() {
		super();
	}

	// create parameterized constructor
	public ListBook(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// get and set Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	// get and set Title
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	// get and set Author
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author= author;
	}

	// show the book details
	public String returnBookDetails() {
		return this.title+ ": " + this.author;
	}
}
