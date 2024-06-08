package com.codesoft.atminterface;

public class ATM {
	
	private String accountHolderName;
	private String accountNumber;
	private double accountBalance;
	private PanCard panCard;
	private AdharCard adharCard;
	
	public ATM(String accountHolderName, String accountNumber, double accountBalance, PanCard panCard, AdharCard adharCard) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.panCard = panCard;
		this.adharCard = adharCard;
		
		
	}

	public String getUsername() {
		return accountHolderName;
	}

	public void setUsername(String username) {
		this.accountHolderName = username;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	public AdharCard getAdharCard() {
		return adharCard;
	}

	public void setAdharCard(AdharCard adharCard) {
		this.adharCard = adharCard;
	}

	
	public void deposit(double amount) {
		if(amount>0) {
			this.accountBalance=this.accountBalance +amount;
			
		} 
		System.out.println("Your account " + accountNumber + " creadited with amount " + amount);
		System.out.println("accountBalance " + accountBalance);
		
	}
	
	
	public void withdraw(double amount) {
		if(this.accountBalance>amount) {
			this.accountBalance=this.accountBalance - amount;
			
			System.out.println("Your Account " + accountNumber + " is debited with amount " + amount);
			System.out.println("Available balance " + accountBalance);
		}
		else {
			System.out.println("Sorry Can not proceed,insufficient balance !!!");
			
		}
	}
	public void checkBalance() {
		System.out.println("Your Account Number "+ accountNumber);
		System.out.println("Available balance "+ accountBalance);
	
	}
	
	public void getAccountHolderInformation() {
		System.out.println("---------------------------------Account Holder Information----------------------");
	System.out.println("Account Number: " + this.accountNumber);
	System.out.println("Account Available Balance:" +  this.accountBalance) ;
	System.out.println("*****************ADHAR CARD DETAILS*************************");
	System.out.println("Name: " + adharCard.getMyName());
	System.out.println("DOB: " + adharCard.getDob());
	System.out.println("Address: " + adharCard.getAddress());
	System.out.println("Adhar Card Number: " + adharCard.getAdharNumber());
	System.out.println("*****************PAN CARD DETAILS*************************");
	System.out.println("Name:" + panCard.getName());
	System.out.println("DOB:" + panCard.getDob());
	System.out.println("Pan Card Number:" + panCard.getPanNumber());
	System.out.println("____________________________________________________________");
	}
	@Override
	public String toString() {
		return "ATM [username=" + accountHolderName + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", panCard=" + panCard + ", adharCard=" + adharCard + "]";
	}

	
}
