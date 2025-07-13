package ai.day9.rsbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import java.sql.Connection;

public class DBConnection {
	public static Connection connect(){
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); ////1---------load driver
			System.out.println("driver loaded !!! ");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/r3bank","root",""); ///2 &3
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (SQLException  ae) {
			// TODO: handle exception
			ae.printStackTrace();

		}
		
		
		
		
		 
		
		
		return con;
		
	}
	

}
