package com.Employee.dbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Employee.dbUtil.DBConnection;

public class DBOperations {
	public Boolean addEmployee(Employee employee) {
		Connection con = null;

		Statement st = null;

		String insert = "insert into TEmpD values('" + employee.getName() + "', '" + employee.getEmployeeId()
				+ "', '" + employee.getSalary() + "', '" + employee.getCountry() + "', '" + employee.getCity() + "', '"
				+ employee.getZipCode() + "')";
		try
		{

			DBConnection dc = new DBConnection();

			con = dc.createConnection();

			st = con.createStatement();

			st.execute(insert);

			//System.out.println("Inserted");
			return true;

		}

		catch (Exception e)

		{

			System.out.println(e);

		}
		return null;

	}
	public static void main(String[] args) {
	DBConnection dbcn=new DBConnection();
	Connection conn=dbcn.createConnection();
	}
}
