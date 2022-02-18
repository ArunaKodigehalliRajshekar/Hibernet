package com.xworkz.digital_wallet.dto;

public class WalletDTO {
	
	private int wallet_id;
	private String walletProvider;
	private  double available_balance;
	private int noOfTransactions;
	
	
	public int getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(int wallet_id) {
		this.wallet_id = wallet_id;
	}
	public String getWalletProvider() {
		return walletProvider;
	}
	public void setWalletProvider(String walletProvider) {
		this.walletProvider = walletProvider;
	}
	public double getAvailable_balance() {
		return available_balance;
	}
	public void setAvailable_balance(double available_balance) {
		this.available_balance = available_balance;
	}
	public int getNoOfTransactions() {
		return noOfTransactions;
	}
	public void setNoOfTransactions(int noOfTransactions) {
		this.noOfTransactions = noOfTransactions;
	}
	
	

}
