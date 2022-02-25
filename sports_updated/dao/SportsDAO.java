package com.xworkz.sports.dao;

import com.xworkz.sports.dto.SportsDTO;

public interface SportsDAO {
	public void save(SportsDTO dto);
	
	public SportsDTO  getById(int  id);
	
	public void updateCountryOriginById(String countryOfOrigin, int id);
	
	public void deleteById(int id);

}
