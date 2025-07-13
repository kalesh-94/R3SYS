package ai.day6.abstractt1;

import java.util.Scanner;

public class Product_Management {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Product p = new Electronics();
		int cont;
		
		System.out.println("Welcome to Product Management");
		
		do {
			System.out.println("-----------------");
			System.out.println("Enter Your choise: 1. Add Electronic Product\n 2. Add Clothing Product\n 3. Add Grocery Product");
			int choise = sc.nextInt();
			switch(choise){
			case 1:
				p.inputDetails();
				p.calculateFinalPrice();
				p.displayDetails();
			break;
			
			case 2:
				p = new Clothing();
				p.inputDetails();
				p.calculateFinalPrice();
				p.displayDetails();
			break;
			
			case 3:
				p  = new Grocery();
				p.inputDetails();
				p.calculateFinalPrice();
				p.displayDetails();
				
			break;
			
			default:
				System.out.println("Enter valid choise");
				
			}
			
			System.out.println("-----------------");
			System.out.println("-----------------");
			System.out.println("Enter 1: To continue \n 2: Exit");
			cont = sc.nextInt();
		} while (cont==1);
		
		System.out.println("Thanks you visit again to Product Management");
		
		
		
		
		

	}

}
