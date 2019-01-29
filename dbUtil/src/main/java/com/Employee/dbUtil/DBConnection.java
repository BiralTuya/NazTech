package com.Employee.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private static Connection conn;
	public Connection createConnection() {
					
		try
		{
			
			
			conn = DriverManager.getConnection("jdbc:sqlserver://vNTDACWSSQLD002:1433;"
					+ "databaseName=DEV_TEST;user=dev_test_dbo;password=dev_test_dbo123");
			if(conn!=null) {
				System.out.print("connected");
			}
			else {
				System.out.print("not connected");
			}
		}
		catch (Exception e)
		{
			System.out.print(e.getMessage());
		}
		return conn;
}
}
