package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public List<Customer> getCustomers(){
		Session currentSession=sessionfactory.getCurrentSession();
		Query<Customer> query=currentSession.createQuery("from Customer order by lastName",Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
		
	}

	@Override
	public void saveCustomer(Customer theCustomer) {
		Session currentSession=sessionfactory.getCurrentSession();
		currentSession.saveOrUpdate(theCustomer);
		
		
	}

	@Override
	public Customer getCustomer(int theId) {
		Session currentSession=sessionfactory.getCurrentSession();
		Customer theCustomer= currentSession.get(Customer.class,theId);
		return theCustomer;
	}

}
