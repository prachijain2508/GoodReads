package com.springframework.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.user_master;
import com.springframework.service.User_masterService;

public class User_masterServiceImpl implements User_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveUser(user_master u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(user_master u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(user_master u) {
		// TODO Auto-generated method stub

	}

	@Override
	public user_master getByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<user_master> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public user_master Check_Login(String U_Email, String U_Password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Update_Block_Status(boolean status) {
		// TODO Auto-generated method stub
		return false;
	}

}
