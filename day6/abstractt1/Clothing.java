package ai.day6.abstractt1;

import java.util.Scanner;

public class Clothing extends Product{
	Scanner s = new Scanner(System.in);
	String size;
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
		
		 System.out.println("Enter size of cloth: ");
		 size = s.next();
		 
		 
		
		 
	 }
	 void calculateFinalPrice(){
		 if(basePrice>2000){
			 finalPrice = (basePrice-300)+ (basePrice*12/100);
		 }else{
			 finalPrice = (basePrice)+ (basePrice*12/100);
		 }
		 System.out.println("final price is: "+finalPrice);
		 
		 
	 }
	 void displayDetails(){
		 System.out.println("these is full details: ");
		 System.out.println("Product Name: "+productName);
		 System.out.println("ProductId: "+productId);
		 System.out.println("Product BasePrice: "+basePrice);
		 System.out.println("Product final price: "+finalPrice);
		 System.out.println("size "+size);
		 
	 }
}
