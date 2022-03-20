package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ShowAllJdbc {
	public static void main(String[] args) throws SQLException {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("driver is loaded");
	
	} catch (ClassNotFoundException e){
		e.printStackTrace();
	}
	
	Statement stmt = null;
	ResultSet rs = null;
	
	Connection connection = null;
	try {
		connection =  DriverManager.getConnection
			("jdbc:mysql://127.0.0.1:3306/harman_book","root","bhavana");
		stmt = connection.createStatement();
		rs = stmt.executeQuery("select * from books");
		
		while(rs.next()) {
			System.out.println(rs.getInt("book_id"));
			System.out.println(rs.getString("book_name"));
			System.out.println(rs.getString("book_author"));
			System.out.println(rs.getInt("book_price"));
		}
		
		
	} catch (SQLException e) {
		e.printStackTrace();
	}finally {
		if(connection != null) {
			connection.close();
		}
	}
	

	}

}
