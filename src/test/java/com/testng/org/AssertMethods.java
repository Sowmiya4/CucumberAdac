package com.testng.org;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertMethods {

	@Test
	private void test() {
		
		
		  String actual = "Sowmiya"; 
		  String expected = "SOWMIYA";
		 
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
		sa.assertAll();
	}
}
