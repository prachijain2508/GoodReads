package com.springframework.service;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.order_items_master;
import com.springframework.bin.user_master;

public interface Order_items_masterService {

	public void setTemplate(HibernateTemplate template);

	public void saveOrder_item(order_items_master oi);
	
	public void updateOrder_item(order_items_master oi);
	
	public void deleteOrder_item(order_items_master oi);
	
	public order_items_master getByItem_Id(int Item_id);
	
	public List<user_master> getOrder_ItemsByOrderId(int Order_id);
}
