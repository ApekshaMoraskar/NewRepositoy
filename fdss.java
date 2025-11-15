package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fdss {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver dr= new ChromeDriver();
		dr.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		//dr.manage().window().fullscreen();
		dr.manage().window().maximize();
		//dr.manage().window().minimize();
		
	    WebElement we = dr.findElement(By.id("name"));
		WebElement we1 = dr.findElement(By.id("email"));
		WebElement we2= dr.findElement(By.id("gender"));
		Thread.sleep(4000);
		
	    we.click();
		we.sendKeys("fgjgfk");
	    we1.sendKeys("fdhdh");
		we2.click();
		
		WebElement we3 = dr.findElement(By.id("mobile"));
		we3.sendKeys("1234567898");
		we3.click();
		
		WebElement w4 = dr.findElement(By.id("dob"));
		w4.sendKeys("20/08/2002");
		w4.click();
		
		WebElement w5=dr.findElement(By.id("subjects"));
		w5.sendKeys("English");
		w5.click();
		
		dr.findElement(By.xpath("//input[@id='subjects']//following::input[1]"));
		w5.click();
		
		dr.findElement(By.name("picture")).sendKeys("C:\\Users\\CDAC\\Pictures\\Screenshots\\Screenshot (1).png");
		
				dr.findElement(By.id("picture"));
				
				
				
				
	
		
	}

}
