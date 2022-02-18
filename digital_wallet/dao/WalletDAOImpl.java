package com.xworkz.digital_wallet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.xworkz.digital_wallet.dto.WalletDTO;

public class WalletDAOImpl  implements WalletDAO{

	@Override
	public int insertAllWallets(List<WalletDTO> dto) {
		
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/digiwallet","root", "Arun@6134");
			
			statement=connection.prepareStatement("insert  into  digi_wallet  values(?, ?, ?, ?)");
			
			for (WalletDTO walletDTO : dto) {
				statement.setInt(1, walletDTO.getWallet_id());
				statement.setString(2, walletDTO.getWalletProvider());
				statement.setDouble(3,walletDTO.getAvailable_balance());
				statement.setInt(4,walletDTO.getNoOfTransactions());
				
				statement.addBatch();
			}
			
			statement.executeBatch();
			System.out.println("data added successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(statement !=null)
				statement.close();
				if(connection!=null)
					connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
	}

}
