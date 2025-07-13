package ai.day7exception1;

import java.util.Scanner;

public class Trial1 {
	Scanner s = new Scanner(System.in);
	void input(){
		System.out.println("Enter string to covert to int");
		
		String num = s.nextLine();
		try {
			int intnumber = Integer.parseInt(num);
			System.out.println(intnumber*2);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Invalid input !!!! please enter digits only");
		}
	}
}



