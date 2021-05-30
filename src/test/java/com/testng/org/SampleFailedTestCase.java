package com.testng.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleFailedTestCase {
	
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	private void test() {

		Assert.assertEquals("ABCD", "abcd");
	}

}
