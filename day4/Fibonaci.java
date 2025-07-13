package ai.day4;
import java.util.Scanner;
public class Fibonaci {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int series = sc.nextInt();
		int f1 = 0; 
		int f2 = 1; 
		int f3;
		
		System.out.println(f1);
		System.out.println(f2);
		for(int i=2; i<series; i++){
			f3 = f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
			
		}
		
		
		
	}
}
