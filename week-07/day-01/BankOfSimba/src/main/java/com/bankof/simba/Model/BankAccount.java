package com.bankof.simba.Model;

import java.text.DecimalFormat;

public class BankAccount {

	private String name;
	private int balance;
	private String animalType;

	public BankAccount(String name, int balance, String animalType) {
		this.name = name;
		this.animalType = animalType;
		/*DecimalFormat decimalFormat = new DecimalFormat("#.00");
		this.balance = decimalFormat.format(balance);*/
		this.balance = balance;
	}

	public boolean isKing() {
		if (this.name.equals("King")) {
			return true;
		}
		return false;
	}

	public void raiseBalance() {
		if (isKing()) {
			this.balance += 100;
		} else {
			this.balance += 10;
		}
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}
}
