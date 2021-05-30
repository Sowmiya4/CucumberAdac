package com.testng.org;

import org.testng.annotations.Test;

public class TimeOut {

	@Test(timeOut = 3000)
	private void browserLaunch() throws InterruptedException {

		//Thread.sleep(5000);
		System.out.println("Browser launch");
	}
}
