package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_master;
import com.goodreads.service.Order_masterService;

public class Order_masterServiceImpl implements Order_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrder(order_master o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrder(order_master o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOrder(order_master o) {
		// TODO Auto-generated method stub

	}

	@Override
	public order_master getByOrder_Id(int Order_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<order_master> getOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<order_master> getOrdersByU_Id(int U_Id) {
		// TODO Auto-generated method stub
		return null;
	}

}