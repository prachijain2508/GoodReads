package com.goodreads.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.bookmark_master;

public interface Bookmark_masterDao {

	public void setTemplate(HibernateTemplate template);

	public void saveBookmark(bookmark_master b);
	
	public void updateBookmark(bookmark_master b);
	
	public void deleteBookmark(bookmark_master b);
	
	public bookmark_master getByU_Id(int U_Id);
	
	public bookmark_master getByISBN(String ISBN);
	
	public List<bookmark_master> getBookmarksByU_Id(int U_Id);
	
}
