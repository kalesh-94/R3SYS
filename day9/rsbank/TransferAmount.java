package ai.day9.rsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class TransferAmount {
	
	void transfer(){
		try {
			Connection con = DBConnection.connect();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sender's id: ");
			int senderId = sc.nextInt();
			System.out.println("Enter Reciever's id: ");
			int recieverId = sc.nextInt();
			
			
			///sender obj fecth
			PreparedStatement psender = con.prepareStatement("select balance from users where id=?");
			psender.setInt(1, senderId);
			
			ResultSet prs = psender.executeQuery();
			 int senderBalance = prs.getInt(5);
			 
			///reciever fetch-------
			
			PreparedStatement psReceiver  = con.prepareStatement("select balance from users where id=?");
			psReceiver .setInt(1, recieverId);
			ResultSet rrs = psReceiver.executeQuery();
//			int reciever balance = 
			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e);
		}
	}
	

}
