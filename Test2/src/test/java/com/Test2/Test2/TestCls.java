package com.Test2.Test2;

import junit.framework.TestCase;

public class TestCls extends TestCase {
	public void fine() {
	App b=new App2();
	int res=b.age(30, 20);
	assertEquals(res,50);
	}
}
