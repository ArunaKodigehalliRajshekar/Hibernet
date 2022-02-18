package com.xworkz.digital_wallet;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.digital_wallet.dao.WalletDAOImpl;
import com.xworkz.digital_wallet.dto.WalletDTO;

public class TestWallet {
	public static void main(String[] args) {
		
		WalletDTO dto = new WalletDTO();
		dto.setWallet_id(11);
		dto.setWalletProvider("Phone-pe");
		dto.setAvailable_balance(99.56);
		dto.setNoOfTransactions(11);
		
		WalletDTO dto2 = new WalletDTO();
		dto2.setWallet_id(12);
		dto2.setWalletProvider("G-pay");
		dto2.setAvailable_balance(299.85);
		dto2.setNoOfTransactions(9);
		
		WalletDTO dto3 = new WalletDTO();
		dto3.setWallet_id(21);
		dto3.setWalletProvider("payTM");
		dto3.setAvailable_balance(185.59);
		dto3.setNoOfTransactions(3);
		
		WalletDAOImpl dao = new WalletDAOImpl();
		List<WalletDTO> wallet = new ArrayList<WalletDTO>();
		wallet.add(dto);
		wallet.add(dto2);
		wallet.add(dto3);
		
		int insert=dao.insertAllWallets(wallet);
		System.out.println(insert);
		
	}

}
