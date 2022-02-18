package com.xworkz.sports.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.sports.dto.SportsDTO;
import com.xworkz.sports.util.HibernateUtil;

public class SportsDAOImpl implements SportsDAO{
	
	public void save(SportsDTO dto) {
		
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

	public SportsDTO getById(int id) {
		
		Session session = null;
		SportsDTO sportsdto =null;
		 
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			
			SessionFactory factory = configuration.buildSessionFactory();
			
			session=factory.openSession();
			
			
			  sportsdto= session.get(SportsDTO.class, id);
			System.out.println("getting by id");
			
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			
			if(session!=null)
			session.close();
			
		}
		
		return sportsdto;
		
	}
	
	public SportsDTO getSportsById(int SportsId) {
		 Session  session =null;
		 SportsDTO dto = null;
		 
			try {
		 SessionFactory factory = HibernateUtil.getSessionFactory();
		session=factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		dto=session.get(SportsDTO.class, SportsId);
		
		transaction.commit();
		
	
			
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(session!=null)
			session.close();
		}
			
			return dto;
	}
	
	public void updateCountryOriginById(String countryOfOrigin, int id) {
		
		Session session = null;
		SportsDTO dto = null;
		Transaction transaction = null;
		
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			session=factory.openSession();
			transaction=session.beginTransaction();
			
			dto=session.get(SportsDTO.class, id);
			
			if(dto!=null) {
				System.out.println(dto);
			dto.setCountryOfOrigin(countryOfOrigin);
			session.update(dto);
			}
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)
			session.close();
		}
	}
	
	public void deleteById(int id) {
		
		Session session = null;
		SportsDTO dto =null;
		Transaction transaction =null;
		
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			session=factory.openSession();
			transaction = session.beginTransaction(); 
			
			dto=session.get(SportsDTO.class, id);
			if(dto!=null)
			session.delete(dto);
			
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(session!=null)
			session.close();
		}
	
	}
	
	
	

}
