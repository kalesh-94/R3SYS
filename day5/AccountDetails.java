package ai.day5;

import java.util.Scanner;


public class AccountDetails {
	int accNo=101;
	String name="kalesh patil";
	double balance=10000;
	
	Scanner s = new Scanner(System.in);
	
	
	void addUser(){
		System.out.println("Add user--->Enter your name: "); 
		name = s.nextLine();
	}
	
	void viewUser(){
		System.out.println("Users: "+name);
	}
	
	void checkBalance(){
		System.out.println("Your Current Balance is: "+balance);
	}

}
