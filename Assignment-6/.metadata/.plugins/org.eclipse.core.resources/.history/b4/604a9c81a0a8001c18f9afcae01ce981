package com.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class AddBook {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver is loaded..");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		PreparedStatement stmt=null;
		Connection connection=null;
		
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/harman_book", "root", "bhavana");
			
			stmt=connection.
					prepareStatement("insert into books(book_id, book_name, book_author, book_price) values(?,?,?,?)");
			
			stmt.setInt(1, 4);
			stmt.setString(2, "NewBook");
			stmt.setString(3, "NewAuthor");
			stmt.setInt(4, 500);
			
			int noOfRowsEffected= stmt.executeUpdate();
			System.out.println(noOfRowsEffected);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
