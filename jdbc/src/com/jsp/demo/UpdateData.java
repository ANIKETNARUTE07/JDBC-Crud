package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateData {
	public static void main(String[] args) {
		String url= "jdbc:mysql://localhost:3306/aniketdb";
		String username= "root";
		String password= "root";
		String sql= "UPDATE ANIDETAILS SET NAME= 'PRATIK', EMAIL='PRATIK@123' WHERE ID=2";
				
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	        con=	DriverManager.getConnection(url, username, password);
			System.out.println("connecrtion created");
			Statement stmt=con.createStatement();
			int a=stmt.executeUpdate(sql);
			if(a>0) {
				System.out.println("record updated");				
			}else System.out.println("record not updated");
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


