package com.xworkz.sports.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="games_detail")
public class SportsDTO {
	
	@Id
	@Column (name ="sport_id")
	private int id;
	@Column (name ="sport_type")
	private String sportsType;
	@Column (name="sport_name")
	private String sportsName;
	@Column (name="no_of_players")
	private  int  noOfPlayers;
	@Column (name ="country_of_origin")
	private String countryOfOrigin;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSportsType() {
		return sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	
	

}
