package ai.day7exception1;

import java.util.Scanner;

public class ATM_System {
	double balance=1000;
	Scanner sc = new Scanner(System.in);
	Exception e = new Exception();
	void checkbalance(){
		System.out.println("Your current balance is: "+balance);
		
	}
	
	void withdraw() throws isufficientBalanceExeption{
		try {
			System.out.println("enter amount to withdraw");
			int amount = sc.nextInt();
			if(amount<5000){
				balance = balance - amount;
				System.out.println("withdraw successful !!! ");
			}
			else{
				throw new isufficientBalanceExeption("can't be deducted isufficient Balance");
			}
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Enter valid input ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unexpected error: "+e.getMessage());
		}
	
	}
	
	
}
