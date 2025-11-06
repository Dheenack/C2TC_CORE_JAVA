package com.tnsif.ifet.day24.dao;

import java.sql.*;

public class DBUtil{
	private static Connection con;
	private static final String DB_DRIVER_CLASS="driver.class.name";
	private static final String DB_USERNAME="db_username";
	private static final String DB_PASSWORD="db_username";
	private static final String DB_URL ="db.url";
	
	public static Connection getConnection() {
		try {
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");

			// connect to database
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("Error..."+e.getMessage());
		}
		catch (SQLException e) {
			System.out.println("Error..."+e.getMessage());
			// TODO: handle exception
		}
		return con;
	}
			
}