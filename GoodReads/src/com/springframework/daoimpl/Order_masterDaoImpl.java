package com.springframework.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.order_master;
import com.springframework.dao.Order_masterDao;

public class Order_masterDaoImpl implements Order_masterDao {

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
