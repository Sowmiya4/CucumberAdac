package com.testng.org;

import org.testng.annotations.*;

public class SimpleAnnotation {

	
	@Test
	private void url() {

		System.out.println("amazon url");
	}
	
	@Test(invocationCount = 5)
	private void login() {

		System.out.println("Login");
	}
	
	@Test
	private void searchMobile() {

		System.out.println("Mobile");
	}
	
	@Test
	private void searchLaptop() {

		System.out.println("Laptop");
	}
	
	@Test
	private void logout() {

		System.out.println("logout");
	}
	
	
}
