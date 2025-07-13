package ai.day6.abstractt1;

import java.util.Scanner;

public class Grocery extends Product {
	Scanner s = new Scanner(System.in);
	double weightInKg;
	String productId;
	String productName;
	double basePrice;
	double finalPrice;
	
	void inputDetails(){
		 System.out.println("Enter Product Name: ");
		 productName = s.nextLine();
		 System.out.println("Enter Product Id: ");
		productId = s.nextLine();
		System.out.println("enter BasePrice: ");
		 basePrice = s.nextDouble();
		
		 System.out.println("Enter weightInKg: ");
		 weightInKg = s.nextDouble();
		 
		 
		
		 
	 }
	 void calculateFinalPrice(){
		 if(weightInKg>5){
			 finalPrice = (basePrice+5/100)- (basePrice*10/100);
		 }else{
			 finalPrice = (basePrice)+(basePrice*5/100);
		 }
		 System.out.println("final price is: "+finalPrice);
		 
		 
	 }
	 void displayDetails(){
		 System.out.println("these is full details: ");
		 System.out.println("Product Name: "+productName);
		 System.out.println("of weight "+weightInKg);
		 System.out.println("ProductId: "+productId);
		 System.out.println("Product BasePrice: "+basePrice);
		 System.out.println("Product final price: "+finalPrice);
		 
	 }

}
