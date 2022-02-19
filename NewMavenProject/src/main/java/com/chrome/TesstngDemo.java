package com.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TesstngDemo {
	
	static WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=3)
	public void teardown() {
		driver.close();
	}

}
