package com.springframework.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.book_master;
import com.springframework.dao.Book_masterDao;

public class Book_masterDaoImpl implements Book_masterDao {

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
