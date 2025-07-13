package ai.day5;

import java.util.Scanner;

public class AmountDeposit extends AccountDetails {
	
	Scanner sc = new Scanner(System.in);
	double amount;
	
	void deposit(){
		System.out.println("add amount : ");
		amount = sc.nextDouble();
		
		balance += amount;
		checkBalance();
	}
	
	
	
}
