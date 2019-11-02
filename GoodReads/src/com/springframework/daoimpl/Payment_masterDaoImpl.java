package com.springframework.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.springframework.bin.payment_master;
import com.springframework.dao.Payment_masterDao;

public class Payment_masterDaoImpl implements Payment_masterDao {

	@Override
	public void setTemplate(HibernateTemplate template) {
		// TODO Auto-generated method stub

	}

	@Override
	public void savePayment(payment_master p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePayment(payment_master p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePayment(payment_master p) {
		// TODO Auto-generated method stub

	}

	@Override
	public payment_master getByPyment_Id(int Payment_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public payment_master getByOrder_Id(int Order_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<payment_master> getPayments() {
		// TODO Auto-generated method stub
		return null;
	}

}
