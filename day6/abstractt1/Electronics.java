package ai.day6.abstractt1;

import java.util.Scanner;

public class Electronics extends Product {
	Scanner s = new Scanner(System.in);
	String productId;
	String productName;
	double basePrice;
	int warrantyYears;
	double finalPrice;
	
	 void inputDetails(){
		 System.out.println("Enter Product Name: ");
		 productName = s.nextLine();
		 System.out.println("Enter Product Id: ");
		productId = s.nextLine();
		System.out.println("enter BasePrice: ");
		 basePrice = s.nextDouble();
		 
		 System.out.println("Enter Warrenty of Product: ");
		 warrantyYears = s.nextInt();
		 
		 
		
		 
	 }
	 void calculateFinalPrice(){
		 if(warrantyYears>1){
			 finalPrice = (basePrice+500)+ (basePrice*18/100);
		 }else{
			 finalPrice = (basePrice)+ (basePrice*18/100);
		 }
		 System.out.println("final price is: "+finalPrice);
		 
		 
	 }
	 void displayDetails(){
		 System.out.println("these is full details: ");
		 System.out.println("Product Name: "+productName);
		 System.out.println("ProductId: "+productId);
		 System.out.println("Product BasePrice: "+basePrice);
		 System.out.println("Product warrenty: "+warrantyYears);
		 
	 }

}
