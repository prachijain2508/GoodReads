package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.rating_master;
import com.goodreads.service.Rating_masterService;

public class Rating_masterServiceImpl implements Rating_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveRating(rating_master r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateRating(rating_master r) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteRating(rating_master r) {
		// TODO Auto-generated method stub

	}

	@Override
	public rating_master getByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<rating_master> getRatingsByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<rating_master> getRatingsByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
