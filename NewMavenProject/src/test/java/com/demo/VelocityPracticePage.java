package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VelocityPracticePage {

	static WebDriver driver;
	@Test
	public static void main() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
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
