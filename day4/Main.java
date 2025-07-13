
package ai.day4;
import java.util.Scanner;
import ai.day4.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		int choise;
		
		do{
			System.out.println("Enter First num");
			x = sc.nextInt();
			System.out.println("Enter second num");
			y = sc.nextInt();
System.out.println("Enter your Operation \n 1:Addtion \n 2: Subtraction \n 3: Multiplication \n 4: Divide");
			
			int ch = sc.nextInt();
			
			switch(ch){
			case 1:
				Calculator add = new Calculator();
				add.addtion(x,y);
			break;
			case 2:
				Calculator sub = new Calculator();
				sub.subtract(x,y);
			break;
			case 3:
				Calculator mul = new Calculator();
				mul.multiply(x,y);
			break;
			case 4:
				Calculator div = new Calculator();
				div.divide(x,y);
				
			}
			System.out.println("Enter Your choise \n 1: To continue operations \n 2: To Quite");
			choise = sc.nextInt();
		}while(choise==1);
		

	}

}
