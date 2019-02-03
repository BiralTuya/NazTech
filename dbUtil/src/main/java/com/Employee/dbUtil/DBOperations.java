package com.Employee.dbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Employee.dbUtil.DBConnection;

public class DBOperations {
	public static void main(String[] args) {
	DBConnection dbcn=new DBConnection();
	Connection conn=dbcn.createConnection();
	Employee emp = new Employee();
	CRUDOperations obj=new CRUDOperations();
	
	emp.SetName("Tuya");
	emp.SetId(002);
	emp.SetEmail("abc@abc");
	emp.SetPhone(123);
	emp.SetAddress("Rajshahi");
	emp.SetAge(24);
	
	obj.AddEmployee(emp);
	obj.DeleteEmployee(emp,0);
	
	/*System.out.println(emp.GetName());
	System.out.println(emp.GetId());
	System.out.println(emp.GetEmail());
	System.out.println(emp.GetPhone());
	System.out.println(emp.GetAddress());
	System.out.println(emp.GetAge());*/
	}
}
