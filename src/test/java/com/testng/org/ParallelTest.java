package com.testng.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	private void instagram() {

		System.setProperty("webdriver.chrome.driver", "D:\\Sowmi\\ganishka_Selenium\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}
	
	@Test
	private void amazon() {

		System.setProperty("webdriver.chrome.driver", "D:\\Sowmi\\ganishka_Selenium\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	private void facebook() {

		System.setProperty("webdriver.chrome.driver", "D:\\Sowmi\\ganishka_Selenium\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	private void flipkart() {

		System.setProperty("webdriver.chrome.driver", "D:\\Sowmi\\ganishka_Selenium\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	}
}
