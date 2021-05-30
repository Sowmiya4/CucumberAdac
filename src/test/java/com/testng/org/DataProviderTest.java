package com.testng.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "testData")
	private void credential(String username,String password) {
		
		System.out.println("Username = "+username+" Password = "+password);
		
	}
	
	@DataProvider
	private Object[][] testData() {

		return new Object[][] {{"Balaji","Balaji123"},
								{"Barani","Barani789"},
								{"Jeevitha","Jeevitha456"}
		};
	}
}
