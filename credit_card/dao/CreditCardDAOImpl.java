package com.xworkz.credit_card.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.credit_card.dto.CreditCardDTO;

public class CreditCardDAOImpl implements CreditCardDAO{

	public void saveAllDetails(CreditCardDTO dto) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(dto);
		transaction.commit();
		
		
		session.close();
		
		System.out.println("saved data succesfully");
		
	}
	

}
