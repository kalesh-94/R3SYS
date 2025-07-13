package ai.day6.Interface;

import java.util.Scanner;

public class R3SYS_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankAccount acc = new SavingsAccount();
		int con;
		do {
			
			System.out.println("Welcome To R3Sys Bank !!!!!!! ");
			
			System.out.println("Enter Your choises\n  1: Create Savings Account \n 2. Create Current Account\n 3. Create Loan Account\n 4. Deposit Money\n 5. Withdraw Money\n 6. Calculate Interest\n 7. Display Account Info");
			int choise = sc.nextInt();
			
			
			switch(choise){
			case 1 :
				acc.createAccount();
				break;
			case 2 :
				acc = new CurrentAccount();
				acc.createAccount();
				break;
			case 3 :
				acc = new LoanAccount();
				acc.createAccount();
				break;
			case 4 :
				acc.deposit();
				break;
			case 5 :
				acc.withdraw();
				break;
			case 6 :
				acc.calculateIntrest();
				break;
			case 7 :
				acc.displayAccountDetails();
				break;
			}
			System.out.println("Enter 1: to Countinue \n 2: To Exit ");
			con = sc.nextInt();
			 
		} while (con==1);
		System.out.println("Thanks for Coming Visit again R3SYS");
		
		
		
		
		
		

	}

}
