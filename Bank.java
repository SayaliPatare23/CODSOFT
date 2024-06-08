package com.codesoft.atminterface;

import java.util.HashMap;
import java.util.Map;



public class Bank {

public static final String bankName=" Bank";
	
	private static Map<String, ATM> bankDB =new HashMap<>();

	
	public static void createAccount(String accountHolderName,String accountNumber, double accountBalance,  PanCard panCard, AdharCard adharCard) {
		ATM atm=new ATM(accountHolderName, accountNumber,accountBalance,panCard,adharCard);
		bankDB.put(accountNumber, atm);
		System.out.println("Welcome To " + " Bank ");
		System.out.println("Your Account is created succesfully with account Number " + accountNumber);
		
		}
	
	public static void removeAccount(String accountNumber) {
		if(bankDB.containsKey(accountNumber)) {
			bankDB.remove(accountNumber);
		}else {
			System.out.println("Account with Account Number: " + accountNumber +"is not fount in database");
		}
		System.out.println("Thank you for using our bank "+ bankName);
		System.out.println("Your Account is deleted succesfully with Account Number " + accountNumber);
	}
	
	public static ATM getAccount(String accountNumber) {
		ATM account=null;
		if(bankDB.containsKey(accountNumber)) {
			account=bankDB.get(accountNumber);
		}
		return account;
		
	}
	}


