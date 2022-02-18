package com.xworkz.digital_wallet.dao;

import java.util.List;

import com.xworkz.digital_wallet.dto.WalletDTO;

public interface WalletDAO {
	
	public int insertAllWallets(List<WalletDTO> dto);

}
