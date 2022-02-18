package com.xworkz.credit_card;

import java.time.LocalDate;

import com.xworkz.credit_card.dao.CreditCardDAOImpl;
import com.xworkz.credit_card.dto.CreditCardDTO;

public class TestCreditCard {
	
	public static void main(String[] args) {
		
		CreditCardDTO cardDTO = new CreditCardDTO();
		cardDTO.setCardID(7623622);
		cardDTO.setCardNumber(71236228267689l);
		cardDTO.setExpiryDate(LocalDate.now());
		cardDTO.setCardHolderName("Aruna KR");
		cardDTO.setNfcEnabled(false);
		
		CreditCardDTO cardDTO2 = new CreditCardDTO();
		cardDTO2.setCardID(82925511);
		cardDTO2.setCardNumber(991607371823l);
		cardDTO2.setExpiryDate(LocalDate.of(2025, 8, 19));
		cardDTO2.setCardHolderName("Rapid");
		cardDTO2.setNfcEnabled(true);
		
		CreditCardDTO cardDTO3 = new CreditCardDTO();
		cardDTO3.setCardID(76436221);
		cardDTO3.setCardNumber(855071423655l);
		cardDTO3.setExpiryDate(LocalDate.of(2023, 2, 11));
		cardDTO3.setCardHolderName("Ammu");
		cardDTO3.setNfcEnabled(false);
		
		CreditCardDAOImpl impl = new  CreditCardDAOImpl();
		impl.saveAllDetails(cardDTO);
		impl.saveAllDetails(cardDTO2);
		impl.saveAllDetails(cardDTO3);
	}

}
