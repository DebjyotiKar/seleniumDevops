package com.devopstest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testclass {
	
	@Test
	public void add()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	    driver.getTitle();
	    driver.close();
			
	}

}
