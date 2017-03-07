package com.mycompany.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
	
	public List<Book> findByTitleLike(String name);

}
