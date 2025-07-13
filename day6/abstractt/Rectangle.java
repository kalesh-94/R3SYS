package ai.day6.abstractt;

import java.util.Scanner;

public class Rectangle extends Shape{
	int length;
	int breadth;
	double area;
	void input(){
		System.out.println("Enter Length : ");
		Scanner s = new Scanner(System.in);
		length = s.nextInt();
		System.out.println("Enter breadth : ");
		breadth = s.nextInt();
	}
	
	void calculateArea(){
		 area = length*breadth;
		
		
	}
	void displayArea(){
		System.out.println("area of circle: "+area);
	}

}
