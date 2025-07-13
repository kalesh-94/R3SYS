package ai.day6.abstractt;

import java.util.Scanner;

public class Circle extends Shape{
	double r;
	double area;
	void input(){
		System.out.println("Enter radius: ");
		Scanner s = new Scanner(System.in);
		r = s.nextDouble();
	}
	
	void calculateArea(){
		area = Math.PI *r*r;
		
		
	}
	void displayArea(){
		System.out.println("area of circle: "+area);
	}

}
