package ai.day7exception1;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Division2Exception2 {
		Exception e = new Exception();
		Scanner sc = new Scanner(System.in);
		void div(){
			try{
				
				System.out.println("enter first num: ");
				int num1 = sc.nextInt();
				System.out.println("enter second num: ");
				int num2 = sc.nextInt();
				
				int res = num1/num2;
				System.out.println("ans is: "+res);
				
			
		}catch(ArithmeticException er){
			System.out.println("Cannot divid by zero");
			
		} catch (InputMismatchException ae) {
			// TODO: handle exception
			System.out.println("Broo number input de ");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unexpected error: "+e.getMessage());
		}
			
			
		}
		

	}


