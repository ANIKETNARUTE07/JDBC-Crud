package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoSave {
	
	public static void main(String[] args)throws SQLException {
		
		String url= "jdbc:mysql://localhost:3306/javabatch";
		String username= "root";
		String password= "root";
		
		try {
			//load/register the driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	//establish the connection
		Connection conn= null;
	 try {
		 
		 conn= DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	 System.out.println("all good");
	 //execute statement
	// String sql= "INSERT INTO PRODUCT VALUES(3,'MAHINDRA','THAR')";
	//String sql= "DELETE FROM PRODUCT WHERE ID=2";
      String sql= "UPDATE PRODUCT SET NAME=xuv700 WHERE id=1";
	 Statement stmt= null;
	       stmt= conn.createStatement();
	       try {
			stmt.execute(sql);
			
			
		}
	       finally {
	    	   conn.close();
	       }
	
	}
}

