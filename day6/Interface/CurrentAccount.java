package ai.day6.Interface;

import java.util.Scanner;

public class CurrentAccount implements BankAccount{
	
	Scanner s = new Scanner(System.in);
	String accountHolder;
	String accountNum;
	double balance=1000;
	double overdraftLimit = 20000;
	
	
	public void createAccount()
	{
		System.out.println("Welcome to create your current account---- Enter accountHolder's Name: ");
		accountHolder= s.next();
		System.out.println("Enter Acc NUmber: ");
		accountNum= s.next();
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
		return -1;
		
	}

}
