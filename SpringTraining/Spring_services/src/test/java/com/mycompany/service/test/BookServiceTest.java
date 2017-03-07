package com.mycompany.service.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.model.Book;
import com.mycompany.service.BookService;
import com.mycompany.service.ServiceContext;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ServiceContext.class)
public class BookServiceTest{
	
	@Autowired
	protected BookService bookService;
	
	@Test
	public void findByTitle() {
		String titleExpected = "Java";
		List<Book> books = bookService.findByTitle(titleExpected);
		books.forEach(book ->{
			String titleCurrent = book.getTitle();
			Assert.assertTrue("Not Found Java", titleCurrent.contains(titleCurrent));
		});
	}

}
