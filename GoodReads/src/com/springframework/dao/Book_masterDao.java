package com.springframework.dao;

import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import com.springframework.bin.book_master;

public interface Book_masterDao {
	
	public void setTemplate(HibernateTemplate template);

	public void saveBook(book_master b);
	
	public void updateBook(book_master b);
	
	public void deleteBook(book_master b);
	
	public book_master getByISBN(String ISBN);
	
	@SuppressWarnings("unchecked")
	public List<book_master> getBooks();
	
	@SuppressWarnings("unchecked")
	public List<book_master> getBooksByCat_Id(int Cat_Id);
	
}
