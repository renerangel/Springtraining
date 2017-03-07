package com.mycompany.service;

import java.util.List;


import com.mycompany.model.Book;

public interface BookService {

	public List<Book> findByTitle(String title);
}
