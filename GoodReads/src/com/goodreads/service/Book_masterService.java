package com.goodreads.service;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_master;

public interface Book_masterService {
	

	public void saveBook(book_master b);
	
	public void updateBook(book_master b);
	
	public void deleteBook(book_master b);
	
	public book_master getByISBN(String ISBN);
	
	public List<book_master> getBooks();
	
	public List<book_master> getBooksByCat_Id(int Cat_Id);
	
}
