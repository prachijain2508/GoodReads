package com.springframework.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.payment_master;
import com.springframework.bin.user_master;

public interface Payment_masterService {

	
	public void setTemplate(HibernateTemplate template);

	public void savePayment(payment_master p);
	
	public void updatePayment(payment_master p);
	
	public void deletePayment(payment_master p);
	
	public payment_master getByPyment_Id(int Payment_Id);
	
	public payment_master getByOrder_Id(int Order_Id);
	
	@SuppressWarnings("unchecked")
	public List<payment_master> getPayments();
	
}
