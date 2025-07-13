package ai.day5.Inheritance;

import java.util.Scanner;

class SmartCalculator{
	int calculate(int a,int b){
		return a+b;
	}
	
	int calculate(int a, int b, int c){
		return a+b+c;
	}
	
	double calculate(double a, double b){
		return a+b;
	}
	
	String calculate(String s1, String s2 ){
		return s1+s2;
	}
	//avg of array
	
	double calculate(int[] numbers){
		float total=0;
		double avg=0;
		for(int i=0; i<numbers.length; i++){
			total+=numbers[i];
			
		}
		avg = total/numbers.length;
		
		return avg;
	}
	

	
	
	///no para
	void calculate(){
		System.out.println("SmartCalculator is ready !!!!!");
	}
}


class Area{
	///area_of_rectangle:
		double calculate(double length, double width){
			return length*width;
		}
		
		///area_circle:
		double calculate(float radius){
			return Math.PI*radius*radius;
		}
}









public class Overloading {
	public static void main(String []ar){
		SmartCalculator s = new SmartCalculator();
		Area a = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise: \n 1. Add two numbers \n 2. Add three numbers\n 3. Add two decimal numbers\n  4. Concatenate two strings\n 5. Calculate average of N numbers\n 6. Area of rectangle \n 7. Area of circle \n 8. About Calculator\n 9. Exit");
		int choise = sc.nextInt();
		
		switch(choise){
		case 1:
			System.out.println(s.calculate(10,50));
			break;
		case 2:
			System.out.println(s.calculate(2,59,89));
			break;
		case 3:
			System.out.println(s.calculate(89898, 9988888.9));
			break;
		case 4:
			System.out.println(s.calculate("R3","SYs"));
			break;
		case 5:
			System.out.println("enter size of array");
			int n = sc.nextInt();
			int [] numbers = new int[n];
			for(int i=0; i<n; i++){
				numbers[i] = sc.nextInt();
			}
			System.out.println(s.calculate(numbers));
			break;
			
		case 6:
			
			System.out.println(a.calculate(89,9));
			break;
		case 7:
		
			System.out.println(a.calculate(89));
			break;
			
		case 8:
			s.calculate();
			break;
		
		case 9:
			break;
		default:
			System.out.println("enter valid choise");
			break;
		}
	}

}
