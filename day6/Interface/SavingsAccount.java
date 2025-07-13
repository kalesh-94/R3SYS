package ai.day6.Interface;

import java.util.Scanner;

public class SavingsAccount implements BankAccount{
	Scanner s = new Scanner(System.in);
	String accountHolder;
	String accountNum;
	double balance=1000;
	double intrestRate = 4.0;
	
	
	public void createAccount()
	{
		System.out.println("Welcome to create your accunt !!!! \n Enter accountHolder's Name: ");
		accountHolder= s.nextLine();
		System.out.println("Enter Acc NUmber: ");
		accountNum= s.next();
		
		System.out.println("Your account is created successfully !!!! ");
	}
	public void deposit()
	{
		System.out.println("Enter Amount to Deposit: ");
		int amount = s.nextInt();
		balance += amount;
		
	}
	public void withdraw()
	{
		System.out.println("Enter amount to withdraw: ");
		int w_amount = s.nextInt();
		balance -= w_amount;
		System.out.println("withdraw Successful !! now you curr balance is: "+balance);
		
	}
	public void displayAccountDetails(){
		System.out.println("Your all details are: ");
		System.out.println(accountHolder);
		System.out.println(accountNum);
		System.out.println("Current balance is: "+balance);
		
	}
	public double calculateIntrest()
	{
		return +balance * intrestRate/10;
		
	}

}
