package com.Employee.dbUtil;

import java.sql.Connection;
import java.sql.Statement;

public class CRUDOperations {
	public void AddEmployee(Employee emp) {
		//Employee emp = new Employee();
		Connection con = null;

		Statement st = null;

		String insert = "insert into Employee_Sanzila values('" + emp.GetName() + "', '" + emp.GetPhone()
				+ "', '" + emp.GetEmail() + "', '" + emp.GetAddress() + "', '" + emp.GetAge() + "', '"
				+ emp.GetId() + "')";
		try
		{

			DBConnection dc = new DBConnection();

			con = dc.createConnection();

			st = con.createStatement();

			st.execute(insert);

			System.out.println("Inserted");

		}

		catch (Exception e)

		{

			System.out.println(e);

		}

	}
	
	public void DeleteEmployee(Employee emp,int id) {
		//Employee emp = new Employee();
		Connection con = null;

		Statement st = null;

		String delete = "delete from Employee_Sanzila where id="+id;
		try
		{

			DBConnection dc = new DBConnection();

			con = dc.createConnection();

			st = con.createStatement();

			st.execute(delete);

			System.out.println("Deleted");

		}

		catch (Exception e)

		{

			System.out.println(e);

		}

	}
}
