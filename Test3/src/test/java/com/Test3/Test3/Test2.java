package com.Test3.Test3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test2 {
@Test
	
	public void testDaysInMonth() {
		assertEquals(31, App.JANUARY.getdays());
		assertEquals(28, App.FEBRUARY.getdays());
		assertEquals(31, App.MARCH.getdays());
		assertEquals(30, App.APRIL.getdays());
		assertEquals(31, App.MAY.getdays());
		assertEquals(30, App.JUNE.getdays());
		assertEquals(31, App.JULY.getdays());
	}

@Test

public void testNamesInMonth() {
	assertEquals("Jan", App.JANUARY.getname());
	assertEquals("Feb", App.FEBRUARY.getname());
	assertEquals("Mar", App.MARCH.getname());
	assertEquals("Apr", App.APRIL.getname());
	assertEquals("May", App.MAY.getname());
	assertEquals("Jun", App.JUNE.getname());
	assertEquals("Jul", App.JULY.getname());
}

}
