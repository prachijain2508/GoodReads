package com.springframework.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.user_master;
import com.springframework.dao.User_masterDao;


public class User_masterDaoImpl implements User_masterDao {
	
	 HibernateTemplate template;
	
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveUser(user_master u){  
	    template.save(u);  
	}  
	
	public void updateUser(user_master u){  
	    template.update(u);  
	}  
	
	public void deleteUser(user_master u){  
	    template.delete(u);  
	}  
	
	@SuppressWarnings("unchecked")
	public List<user_master> getUsers(){  
	    return template.loadAll(user_master.class);  
	}

	@Override
	public user_master getByU_Id(int U_Id) {
		return (user_master)template.get(user_master.class,U_Id);  
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
