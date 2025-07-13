package ai.day9.rsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddUser {
	Connection con = DBConnection.connect();
	Scanner sc = new Scanner(System.in);
	int id=0;
	String User_Name;
	String email;
	String password;
	int balance;
	
	void add(){
		System.out.println("welcome to R3SYS Bank !!!!");
		System.out.println("Enter your Name: ");
		User_Name= sc.nextLine();
		System.out.println("Enter mailid: ");
		email = sc.next();
		System.out.println("Enter password: ");
		password = sc.next();
		System.out.println("Enter Initial balance: ");
		balance = sc.nextInt();
		
		PreparedStatement pstsm;
		try {
			pstsm = con.prepareStatement("insert into users value(?,?,?,?,?)");
			
			pstsm.setInt(1, id);
			pstsm.setString(2, User_Name);
			pstsm.setString(3, email);
			pstsm.setString(4, password);
			pstsm.setInt(5, balance);
			int i = pstsm.executeUpdate();
			if(i>0){
				System.out.println("User addded successfuly re bhau");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
		
	}
}
