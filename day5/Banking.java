package ai.day5;

import java.util.Scanner;

public class Banking extends AmountWithdraw{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		AmountWithdraw a = new AmountWithdraw();
		a.addUser(); 
		a.checkBalance();
		a.viewUser();
		
		System.out.println("Enter your choise\n 1: DEPOSIT \n 2: TO withdraw balance\n 3: To check balance");
		int choise = sc.nextInt();
		switch(choise){
		
		case 1:
			a.deposit();
			break;
		
		case 2:
			a.withdraw();
			break;
		
		case 3:
			a.checkBalance();
			break;
		}
		
		

	}

}
