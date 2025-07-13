package ai.day5;

import java.util.Scanner;

public class AmountWithdraw extends AmountDeposit{
	double w_amount;
	Scanner sc = new Scanner(System.in);
	
	void withdraw(){
		System.out.println("Enter amount to withdraw: ");
		w_amount = sc.nextDouble();
		if(balance >4999){
			balance = balance - w_amount;
		} else{
			System.out.println("You cannot withdraw");
		}
		
//		AmountDeposit am = new AmountDeposit();
		checkBalance();
		
	}
}
