package ai.day9.rsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Deposit {
	int balance;
	int amount;
	void deposit(){
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("------------");
			System.out.println("");
			System.out.println("Enter your Id to deposit your money: ");
			int id = s.nextInt();
			System.out.println("Enter amount to add in your account: ");
			amount = s.nextInt();
			Connection con = DBConnection.connect();
			PreparedStatement pstsm3 = con.prepareStatement("select * from users where id=?");
			pstsm3.setInt(1, id);
			
			ResultSet rs = pstsm3.executeQuery();
			
			while(rs.next()){
				balance = rs.getInt(5);
				System.out.println(" your Initial balance was: "+balance);
				balance = balance+amount;
				System.out.println("and current balance is: "+balance);
				PreparedStatement pstsm4 = con.prepareStatement("update users set balance=? where id=?");
				pstsm4.setInt(1, balance);
				pstsm4.setInt(2, id);
				
				int x = pstsm4.executeUpdate();
				if(x>0){
					System.out.println("amount deposit successfuly !!!!!!!!!!!!!!!!!!!");
				}else{
					System.out.println("kuchh to gadbad hai daya");
				}
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
