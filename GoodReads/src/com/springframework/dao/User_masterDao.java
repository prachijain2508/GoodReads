package com.springframework.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.user_master;

public interface User_masterDao {
	
	public void setTemplate(HibernateTemplate template);

	public void saveUser(user_master u);
	
	public void updateUser(user_master u);
	
	public void deleteUser(user_master u);
	
	public user_master getByU_Id(int U_Id);
	
	public List<user_master> getUsers();
	
	public user_master Check_Login(String U_Email,String U_Password);
	
	public boolean Update_Block_Status(boolean status);
	
}
