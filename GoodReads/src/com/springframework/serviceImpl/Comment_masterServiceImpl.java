package com.springframework.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.comment_master;
import com.springframework.service.Comment_masterService;

public class Comment_masterServiceImpl implements Comment_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveComment(comment_master c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateComment(comment_master c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteComment(comment_master c) {
		// TODO Auto-generated method stub

	}

	@Override
	public comment_master getByC_Id(int C_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<comment_master> getCommentsByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<comment_master> getCommentsByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}