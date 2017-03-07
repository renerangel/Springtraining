package com.mycompany.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.model.Book;

@Controller
public class BookController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(BookController.class);
	private static final String PAGE_BOOK = "book";
	
	@GetMapping	
	@RequestMapping(value = {"/books"})
	public String incomingBooking() {
		LOGGER.info("Hello world");

		return PAGE_BOOK;
	}
	
	@GetMapping
	@RequestMapping( value ={"/book/new"})
	public String newBook(ModelMap model) {
		Book book = new Book();
		model.addAttribute("newBook", book);
		return PAGE_BOOK;
	}

}
