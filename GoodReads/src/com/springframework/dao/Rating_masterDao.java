package com.springframework.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.rating_master;

public interface Rating_masterDao {

	public void setTemplate(HibernateTemplate template);

	public void saveRating(rating_master r);
	
	public void updateRating(rating_master r);
	
	public void deleteRating(rating_master r);
	
	public rating_master getByU_Id(int U_Id);
	
	public List<rating_master> getRatingsByISBN(String ISBN);
	
	public List<rating_master> getRatingsByU_Id(int U_Id);
}
