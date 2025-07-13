package ai.day6.abstractt;

import java.util.Scanner;

public class Triangle extends Shape{
	double base;
	double height;
	double area;
	void input(){
		System.out.println("Enter base : ");
		Scanner s = new Scanner(System.in);
		base = s.nextDouble();
		System.out.println("Enter height : ");
		height  = s.nextDouble();
	}
	
	void calculateArea(){
		 area = base*height;
		
		
	}
	void displayArea(){
		System.out.println("area of circle: "+area);
	}

}
