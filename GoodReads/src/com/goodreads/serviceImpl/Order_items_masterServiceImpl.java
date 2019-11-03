package com.goodreads.serviceImpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.goodreads.bin.order_items_master;
import com.goodreads.bin.user_master;
import com.goodreads.service.Order_items_masterService;

public class Order_items_masterServiceImpl implements Order_items_masterService {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveOrder_item(order_items_master oi) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOrder_item(order_items_master oi) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOrder_item(order_items_master oi) {
		// TODO Auto-generated method stub

	}

	@Override
	public order_items_master getByItem_Id(int Item_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<user_master> getOrder_ItemsByOrderId(int Order_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
