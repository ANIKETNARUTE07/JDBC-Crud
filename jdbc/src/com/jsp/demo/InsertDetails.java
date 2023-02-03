package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDetails {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/aniketdb";
		String username= "root";
		String password= "root";
		String sql= "INSERT INTO ANIDETAILS VALUES(5,'nitin','nitin@gmail.com','50000','969455553')";
		//String sql = "DELETE FROM ANIDETAILS WHERE ID=1";
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	       con=	DriverManager.getConnection(url, username, password);
			System.out.println("connecrtion created");
			Statement stmt=con.createStatement();
			stmt.execute(sql);
			System.out.println("all good");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
