package com.mycompany.dao.test;

import java.util.List;

import org.junit.Test;

import com.mycompany.model.Book;

import junit.framework.Assert;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.dao.BookRepository;
import com.mycompany.dao.PersistenceJPAConfig;

@RunWith(SpringJUnit4ClassRunner.class)	
@ContextConfiguration(classes=PersistenceJPAConfig.class)
public class BooksRepositoryTest {
	
	
	@Autowired
	protected BookRepository bookRepository;
	
	
	@Test
	public void count() {
		long numbersBooks = bookRepository.count();
		Assert.assertTrue("The books are not found", numbersBooks > 0);
	}
	
	
	@Test
	public void findAllBooks() {
		List<Book> books = bookRepository.findAll();
		Assert.assertFalse("The list is empty", books.isEmpty());
	}
	
	@Test
	public void findByTitle() {
		String titleExpected = "Java";
		List<Book> books = bookRepository.findByTitleLike(titleExpected);
		String currenTitle = books.get(0).getTitle();
		Assert.assertTrue(currenTitle.contains(titleExpected));
	}
	

}
