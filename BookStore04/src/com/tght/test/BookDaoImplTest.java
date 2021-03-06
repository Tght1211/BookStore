package com.tght.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;


import com.tght.bean.Book;
import com.tght.dao.BookDao;
import com.tght.dao.impl.BookDaoImpl;


class BookDaoImplTest {

	BookDao bookDao = new BookDaoImpl();
	@Test
	void testGetAllBooks() {
		List<Book> allBooks = bookDao.getAllBooks();
		for(Book book : allBooks) {
			System.out.println(book);
		}
	}
	@Test
	void testAddBook() {
		bookDao.addBook(new Book(null,"testTitle","testAuthor",100,200,250,null));
	}

}
