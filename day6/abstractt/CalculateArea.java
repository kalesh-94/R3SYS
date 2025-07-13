package ai.day6.abstractt;

import java.util.Scanner;

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your shape to calculate area: 1: Circle \n 2: Rectangle \n 3: triangle");
		int choise = s.nextInt();
		switch(choise){
		case 1:
			Shape c = new Circle();
			c.input();
			c.calculateArea();
			c.displayArea();
			
		break;
		
		case 2:
			c = new Rectangle();
			c.input();
			c.calculateArea();
			c.displayArea();
			
			break;
			
		case 3:
			 c = new Triangle();
			c.input();
			c.calculateArea();
			c.displayArea();
			break;
		}
	}

}
