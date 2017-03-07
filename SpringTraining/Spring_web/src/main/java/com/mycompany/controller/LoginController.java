package com.mycompany.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mycompany.model.Book;
import com.mycompany.service.BookService;

@Controller
public class LoginController {

	private static Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	private static final String INDEX_PAGE = "index"; 
	
	@Autowired
	private BookService bookService;
	
	@GetMapping	
	@RequestMapping(value = {"/"})
	public String login() {
		LOGGER.info("Hello world");

		return "index";

	}
	
	@GetMapping
	@RequestMapping(value = {"/showMessage/{msg}"})
	public String showMessageByPathVariable(@PathVariable String msg, ModelMap model){
		LOGGER.info("The message by pathVariable is :"+msg);		
		
		model.addAttribute("newMsg", msg);
		
		return INDEX_PAGE;
	}
	
	@GetMapping
	@RequestMapping(value = {"/showMessage"})
	public String showMessageByRequestParameter(@RequestParam String msg, ModelMap model){
		LOGGER.info("The message by requesParameter is :"+msg);		
		
		model.addAttribute("newMsg", msg);
		
		return INDEX_PAGE;
	}
	
	@GetMapping
	@RequestMapping(value ={"/searchBooks"})
	public String searchBooking(@RequestParam String searchTitle, ModelMap model) {
		LOGGER.info("The message by requesParameter is :"+searchTitle);
		List <Book> books = new ArrayList();
		if(searchTitle != null) {
			books = bookService.findByTitle(searchTitle);
			LOGGER.info("Size books found: "+books.size());
		}
		return INDEX_PAGE;
	}
}
