package com.springframework.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.comment_master;
import com.springframework.bin.user_master;

public interface Comment_masterDao {

	public void setTemplate(HibernateTemplate template);

	public void saveComment(comment_master c);
	
	public void updateComment(comment_master c);
	
	public void deleteComment(comment_master c);
	
	public comment_master getByC_Id(int C_Id);
	
	@SuppressWarnings("unchecked")
	public List<comment_master> getCommentsByISBN(String ISBN);
	
	@SuppressWarnings("unchecked")
	public List<comment_master> getCommentsByU_Id(int U_Id);
	
}
