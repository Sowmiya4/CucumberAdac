package com.testng.org;

import org.testng.annotations.Test;

public class ExceptionTest {

	@Test
	private void add() {
		
		int a =100;
		int b =200;
		
		int c = a+b;
		System.out.println(c);
	}
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void divide() {

		int i = 10;
		int j = 0;
		
		System.out.println(i/j);
		
	}
}
