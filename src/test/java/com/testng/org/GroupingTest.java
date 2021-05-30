package com.testng.org;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test(groups = "UI Automation Testing")
	private void testNG() {
		
		System.out.println("TestNG");
	}
	
	@Test(groups = "UI Automation Testing")
	private void cucumber() {

		System.out.println("Cucumber");
	}
	
	@Test(groups = "API Testing")
	private void postman() {

		System.out.println("Postman");
	}
	
	@Test(groups = "API Testing")
	private void restAssured() {

		System.out.println("RestAssured");
	}
	
	@Test(groups = "Database Testing")
	private void mysql() {

		System.out.println("sql");
	}
	
	@Test(groups = "Database Testing")
	private void sqlOracle() {

		System.out.println("oracle");
	}
	
}
