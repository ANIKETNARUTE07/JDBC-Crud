package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadData {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/aniketdb";
		String username= "root";
		String password= "root";
		String sql= "SELECT * FROM ANIDETAILS where name like 'a%'";
				
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con=	DriverManager.getConnection(url, username, password);
			System.out.println("connecrtion created");
			Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery(sql);
		    while(rs.next()) {
		    int id=rs.getInt(1);
		    String name= rs.getString(2);
		    System.out.println(id);
		    System.out.println(name);
		    }
			
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
