package com.example.com.project_reports;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {
	MyClass mc = new MyClass();
	
	@Test
	public void testAdd1() {
		assertEquals(mc.myAdd1(1),2);
	}

}
