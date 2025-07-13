package ai.day9.rsbank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViewUser {
	void display(){
		Connection con = DBConnection.connect();
		
		try {
			PreparedStatement pstsm2 = con.prepareStatement("Select * from users");
			ResultSet rs = pstsm2.executeQuery();
			
			
			while(rs.next()){
				System.out.println("Id: "+rs.getInt(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Name: "+rs.getString(3));
				System.out.println("Name: "+rs.getString(4));
				System.out.println("Name: "+rs.getInt(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	

}
