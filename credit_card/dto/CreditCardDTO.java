package com.xworkz.credit_card.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "creditcard_details")
public class CreditCardDTO {
	
	@Id
	@Column (name = "card_id")
	private int cardID;
	@Column (name ="card_number")
	private long cardNumber;
	@Column (name ="expiry_date")
	private LocalDate expiryDate;
	@Column (name ="cardholder_name")
	private String cardHolderName;
	@Column (name ="cfEnabeld")
	private boolean nfcEnabled;
	
	public int getCardID() {
		return cardID;
	}
	public void setCardID(int cardID) {
		this.cardID = cardID;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public boolean isNfcEnabled() {
		return nfcEnabled;
	}
	public void setNfcEnabled(boolean nfcEnabled) {
		this.nfcEnabled = nfcEnabled;
	}
	
	
	

}
