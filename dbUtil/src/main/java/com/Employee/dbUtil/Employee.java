package com.Employee.dbUtil;

public class Employee {
	private int id;
	private String name;
	private int phone;
	private String email;
	private String address;
	private int age;
	
	public int GetId() {
		return id;
	}
	public void SetId(int id) {
		this.id=id;
	}
	public String GetName() {
		return name;
	}
	public void SetName(String name) {
		this.name=name;
	}
	public int GetPhone() {
		return phone;
	}
	public void SetPhone(int phone) {
		this.phone=phone;
	}
	public String GetEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email=email;
	}
	public String GetAddress() {
		return address;
	}
	public void SetAddress(String address) {
		this.address=address;
	}
	public int GetAge() {
		return age;
	}
	public void SetAge(int age) {
		this.age=age;
	}
}
