package com.Test3.Test3;

import java.util.Scanner;

public enum App{
	JANUARY("January",31),
	FEBRUARY("February",28),
	MARCH("March",31),
	APRIL("April",30),
	MAY("May",31),
	JUNE("June",30),
	JULY("July",31),
	AUGUST("August",30),
	SEPTEMBER("September",31),
	OCTOBER("October",30),
	NOVEMBER("November",31),
	DECEMBER("December",31);
	
	private String title;
	private int days;
	
	App(String title, int days){
		this.title=title;
		this.days=days;
	}
	public int getdays() {
		return this.days;
	}
	public String getname() {
		return this.title.substring(0,3);
	}
	public static App parse(String s) {
		if(s==null||s.isEmpty())
			return null;
		
		s=s.toUpperCase();
		
		try {
			App.valueOf(s);
		}
		catch(IllegalArgumentException e) {
			for(App month:App.values()) {
				if(month.getname().toUpperCase().equals(s)) {
					return month;
				}
			}
		}
		return null;
	}
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		System.out.println(App.parse(str).getdays()); 
	}
}
