package com.mycompany.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.dao.BookRepository;
import com.mycompany.model.Book;
import com.mycompany.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> findByTitle(String title) {
		
		return bookRepository.findByTitleLike(title);
	}

}
