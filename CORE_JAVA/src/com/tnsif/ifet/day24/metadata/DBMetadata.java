package com.tnsif.ifet.day24.metadata;

import java.sql.*;

import com.tnsif.ifet.day24.dao.*;

public class DBMetadata{
	private static Connection con;
	private static PreparedStatement pst;
	private static ResultSet rs;
	static {
		con=DBUtil.getConnection();
		if (con!=null)
		{
			System.out.println("Connection established.....");
			try {
				pst=con.prepareStatement("SELECT * FROM employee");
				rs=pst.executeQuery();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}
	public static void showDatabaseMetataData()
	{
		try {
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDriverName());
			System.out.println(dbmd.getDriverVersion());
			System.out.println(dbmd.supportsBatchUpdates());
			System.out.println(dbmd.supportsStoredProcedures());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void showRSMetadata()
	{
		try {
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnCount());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}