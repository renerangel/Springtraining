package com.mycompany.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS", schema="mydb")
public class Book {
	
	private String title;
	
	@Id
	private String isbn;
	
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	
	
	

}
