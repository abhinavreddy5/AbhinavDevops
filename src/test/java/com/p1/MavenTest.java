package com.p1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MavenTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void disp(){
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("Hey There");
		
		String str=driver.findElement(By.id("resultStats")).getText();
		
		System.out.println(str);
	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}
}
