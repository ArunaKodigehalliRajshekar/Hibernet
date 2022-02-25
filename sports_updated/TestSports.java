package com.xworkz.sports;

import com.xworkz.sports.dao.SportsDAO;
import com.xworkz.sports.dao.SportsDAOImpl;
import com.xworkz.sports.dto.SportsDTO;

public class TestSports {
	
	public static void main(String[] args) {
		
		SportsDTO dto = new SportsDTO();
		dto.setId(111);
		dto.setSportsName("hockey");
		dto.setNoOfPlayers(11);
		dto.setCountryOfOrigin("india");
		dto.setSportsType("outdoor");
		
		SportsDTO dto2 = new SportsDTO();
		dto2.setId(121);
		dto2.setSportsName("cricket");
		dto2.setCountryOfOrigin("england");
		dto2.setNoOfPlayers(11);
		dto2.setSportsType("outdoor");
		
		SportsDTO dto3 = new SportsDTO();
		dto3.setId(155);
		dto3.setNoOfPlayers(02);
		dto3.setSportsName("chess");
		dto3.setCountryOfOrigin("india");
		dto3.setSportsType("indoor");
		
		
		SportsDAO dao = new SportsDAOImpl();
		
//	     dao.save(dto);
//	     dao.save(dto2);
//	     dao.save(dto3);
		SportsDTO get=	dao.getById(111);
		
		
		System.out.println(get.getNoOfPlayers());
		System.out.println(get.getSportsName());
		System.out.println();
		
		 dao.updateCountryOriginById("india", 121);
		 
		 dao.deleteById(155);
//		dao.saveAllDetails(dto2);
//		dao.saveAllDetails(dto3);
	}

}
