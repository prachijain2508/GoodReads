package com.springframework.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.order_master;
import com.springframework.bin.user_master;

public interface Order_masterService {

	public void setTemplate(HibernateTemplate template);

	public void saveOrder(order_master o);
	
	public void updateOrder(order_master o);
	
	public void deleteOrder(order_master o);
	
	public order_master getByOrder_Id(int Order_Id);
	
	@SuppressWarnings("unchecked")
	public List<order_master> getOrders();
	
	@SuppressWarnings("unchecked")
	public List<order_master> getOrdersByU_Id(int U_Id);
	
}
