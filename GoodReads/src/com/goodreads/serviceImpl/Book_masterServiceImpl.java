package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.book_master;
import com.goodreads.service.Book_masterService;

public class Book_masterServiceImpl implements Book_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveBook(book_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBook(book_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBook(book_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public book_master getByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<book_master> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<book_master> getBooksByCat_Id(int Cat_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
