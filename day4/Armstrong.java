package ai.day4;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=  s.nextInt();
	
		int orig_num = num;
		int pow=0;
		double sum = 0;
		int temp=num;
		
		while(temp>0){
			pow++;
			temp = temp/10;
		}
		while(num>0){
			int rem = num%10;
			sum = sum+ Math.pow(rem, pow);
			num= num/10;
			
		}
		System.out.println(sum);
		if(sum==orig_num){
			System.out.println("number is armstrong");
	
		}
		else{
			System.out.println("Not armstrong");
		}
	

	}

}
