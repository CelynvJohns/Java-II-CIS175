package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "bookstore")
@Table(name = "bookstore")
public class Bookstore {
	// instance variables
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int id;
			private String title;
			private String author;
			private int publishedYear;
			private String genre;
			
			// constructor
			
			public Bookstore(){
				super();
			}
			
			
			// getters and setters
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getTitle() {
				return title;
			}
			public void setTitle(String title) {
				this.title = title;
			}
			public String getAuthor() {
				return author;
			}
			public void setAuthor(String author) {
				this.author = author;
			}
			public int getPublishedYear() {
				return publishedYear;
			}
			public void setPublishedYear(int publishedYear) {
				this.publishedYear = publishedYear;
			}
			public String getGenre() {
				return genre;
			}
			public void setGenre(String genre) {
				this.genre = genre;
			}
			
			// toString
			@Override
			public String toString() {
				return "Bookstore [id=" + id + ", title=" + title + ", author=" + author + ", publishedYear="
						+ publishedYear + ", genre=" + genre + "]";
			}
			
			
	

}
