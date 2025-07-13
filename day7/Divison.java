package ai.day7;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Divison {
	Scanner sc = new Scanner(System.in);
	void div(){
		try{
			
			System.out.println("enter first num: ");
			int num1 = sc.nextInt();
			System.out.println("enter second num: ");
			int num2 = sc.nextInt();
			
			int res = num1/num2;
			System.out.println("ans is: "+res);
			
		
	}catch(ArithmeticException e){
		System.out.println("Cannot divid by zero");
		
	} catch (InputMismatchException e) {
		// TODO: handle exception
		System.out.println("Bhau  number tak piun coding nhi karaychi ");
	}
		
		
	}
	

}
