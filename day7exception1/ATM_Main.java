package ai.day7exception1;

import java.util.Scanner;

public class ATM_Main {

	public static void main(String[] args) throws isufficientBalanceExeption {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		ATM_System a = new ATM_System();
		
		System.out.println("Enter your choise 1: withdraw amount");
		int choise = s.nextInt();
		switch (choise) {
		case 1:
			a.withdraw();
			break;
			
		case 2:
			a.checkbalance();
		default:
			break;
		}
		

	}

}
