package com.springframework.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.bookmark_master;
import com.springframework.service.Bookmark_masterService;

public class Bookmark_masterServiceImpl implements Bookmark_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveBookmark(bookmark_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBookmark(bookmark_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBookmark(bookmark_master b) {
		// TODO Auto-generated method stub

	}

	@Override
	public bookmark_master getByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public bookmark_master getByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<bookmark_master> getBookmarksByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
