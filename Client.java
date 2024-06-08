package com.codesoft.atminterface;

import java.util.Scanner;


public class Client {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\t\t *************** WELCOME TO BANK ***************");
		while(true) {
			
			System.out.println("\t\t 1: Create New Account");
			System.out.println("\t\t 2: Check Balance");
			System.out.println("\t\t 3: Deposit");
			System.out.println("\t\t 4: Withdraw");
			System.out.println("\t\t 5: Account Holder Information");
			System.out.println("\t\t 6: Delete Bank Account");
			System.out.println("\t\t 7: Exit");
			
			System.out.println();
			
			System.out.println("Enter Your Choice:  ");
			int choice = sc.nextInt();
			sc.nextLine();
			
			if(choice==1) {
				System.out.println("Enter Account Holder Name:");
				String name=sc.nextLine()
;				
				
				
				System.out.println("Enter Amount to deposit: ");
				double amount = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Enter Phone Number");
				String phoneNumber= sc.nextLine();
				
				System.out.println("Enter Address");
				String address= sc.nextLine();
				
				System.out.println("Enter DOB");
				String dob= sc.nextLine();
				
				System.out.println("Enter Adhar Number");
				String adharNumber= sc.nextLine();
				
				System.out.println("Enter Pan Number");
				String panNumber=sc.nextLine();
				
				AdharCard adharCard=new AdharCard(name,address,dob,adharNumber);
				PanCard pancard=new PanCard(name,dob,panNumber);
				
				Bank.createAccount(name, dob,amount,pancard,adharCard);
				
			}else if(choice ==2) {
				
				System.out.println("Enter Account Number: ");
				String accountNumber = sc.nextLine();
				try {
					ATM atm=Bank.getAccount(accountNumber);
					atm.checkBalance();
				}catch(Exception e) {
					System.out.println("Account Not found");
				}
				
			}else if(choice==3) {
				System.out.println("Enter Account Number: ");
				String accountNumber=sc.nextLine();
				
				System.out.println("Enter Amount To deposit");
				double amount = sc.nextDouble();
				
				try {
					ATM atm=Bank.getAccount(accountNumber);
					atm.deposit(amount);
				}catch (Exception e) {
					System.out.println("Account Not Found");
				}
				
			}else if(choice==4) {
				System.out.println("Enter Account number");
				String accountNumber=sc.nextLine();
				
				System.out.println("Enter Amount to Withdraw");
				double amount= sc.nextDouble();
				
				try {
					ATM atm=Bank.getAccount(accountNumber);
					atm.withdraw(amount);
				}catch (Exception e) {
					System.out.println("Account Not Found");
				}
				
			}else if(choice==5) {
				System.out.println("Enter Account number");
				String accountNumber=sc.nextLine();
				try {
					ATM atm =Bank.getAccount(accountNumber);
					atm.getAccountHolderInformation();
				}catch(Exception e) {
					System.out.println("Account NOt Found");
				}
			}else if(choice==6) {
				System.out.println("Enter Account Number");
				String accountNumber=sc.nextLine();
				
				Bank.removeAccount(accountNumber);
			}else if(choice==7) {
				break;
			}else {
					}

	}

}


	}


