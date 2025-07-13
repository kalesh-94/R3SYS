package ai.day6.Interface;

import java.util.Scanner;

public class LoanAccount implements BankAccount {
	Scanner s = new Scanner(System.in);
	String borrowerName;
	String loanAccountNumber;
	double loanAmount;
	double intrestRate = 8.5;
	
	
	public void createAccount()
	{
		System.out.println("Welcome to get loan ---- Enter borrowerName : ");
		borrowerName= s.next();
		System.out.println("Enter loan Acc NUmber: ");
		loanAccountNumber= s.next();
		System.out.println("Enter loan Amount: ");
		loanAmount = s.nextDouble();
	}
	public void deposit()
	{
		System.out.println("Deposit now allowed !!!!!!");
		
		
	}
	public void withdraw()
	{
		System.out.println("Withdraw now allowed !!!!!!");		
	}
	public void displayAccountDetails(){
		System.out.println("Your all details are: ");
		System.out.println(borrowerName);
		System.out.println(loanAccountNumber);
		System.out.println(" Taken Loan is: "+loanAmount);
		
	}
	public double calculateIntrest()
	{
		return +loanAmount * intrestRate/100;
		
	}

}
