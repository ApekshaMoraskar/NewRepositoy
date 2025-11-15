package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tutorialspoint {
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver dr= new ChromeDriver();
		dr.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		dr.manage().window().fullscreen();
		dr.manage().window().maximize();
		dr.manage().window().minimize();
		
	    WebElement we = dr.findElement(By.id("name"));
		WebElement we1 = dr.findElement(By.id("email"));
		WebElement we2= dr.findElement(By.id("gender"));
		Thread.sleep(4000);
		
	    we.click();
		we.sendKeys("fgjgfk");
	    we1.sendKeys("fdhdh");
		we2.click();
	//	WebElement sms=dr.findElement(By.id(null));
		
       
		
		
		
	}

}
