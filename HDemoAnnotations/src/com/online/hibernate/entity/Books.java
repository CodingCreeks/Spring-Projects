package com.online.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Authors_Books")
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Book_Id")
	int bookId;

	@Column(name="Author")
	String author;

	@Column(name="Publication")
	String publication;

	@Column(name="Published_Year")
	String publishedYear;

	public Books() {
	}

	public Books(int bookId, String author, String publication, String publishedYear) {
		this.bookId = bookId;
		this.author = author;
		this.publication = publication;
		this.publishedYear = publishedYear;
	}

	public Books(String author, String publication, String publishedYear) {
		this.author = author;
		this.publication = publication;
		this.publishedYear = publishedYear;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
}
