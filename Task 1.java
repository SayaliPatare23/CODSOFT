package com.codsoft.numbergame;

import java.util.Scanner;

public class NumberGame {
	
	public static void guessingNumberGame() {
		Scanner sc=new Scanner(System.in);
		int number=1+(int)(100*Math.random());
		
		int t=6;
		
		final int max=100;
		
		int i;
		int guess;
		
		
		
		System.out.println("************ A number is chosen between 1 to 100 " + " Guess the number " + " within 5 trials .**********");
		
		
		for(i=0;i<t;i++) {
			System.out.println("Guess the number: ");
			
			guess=sc.nextInt();
			
			System.out.println("************************************************************************************************");
			if(number==guess) {
				System.out.println("Congratulations!   you guessed the correct number.👍👍");
				break;
			}
			else if(number > guess && i !=t-1) {
				System.out.println("Your guess is wrong");
				System.out.println("The number is " + " greater than "+guess);
				
			}else if(number < guess && i!=t-1) {
				System.out.println("Your guess is wrong");
				System.out.println("The number is " + " less than "+guess);
				
			}
			
		}
		if(i==t) {
			System.out.println("Sorry You have exhuasted " + " 6 trials.");
			
			System.out.println("The number was "+ number);
			
		}
		
			
		}
		
		
	
	
	
	public static void main(String[] args) {
	guessingNumberGame();

	 
    

}
}
