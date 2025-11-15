package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Page {

	 public static void main(String[] args) throws InterruptedException
	 {
		 WebDriver d= new ChromeDriver();
		 d.get("https://practicetestautomation.com/practice-test-login");
		 d.manage().window().fullscreen();
			
			  WebElement we = d.findElement(By.id("username")); 
			  WebElement w1 = d.findElement(By.id("password"));
			  WebElement w2 = d.findElement(By.id("submit"));
			  we.click();
			  we.sendKeys("kjbug");
			  w1.sendKeys("Password123");
			  w2.click();
			  WebElement msg=d.findElement(By.id("error"));
			  
			  Thread.sleep(2000);
			  System.out.println(msg.getText());  
			  we.click();
			  we.sendKeys("student");
			  w1.sendKeys("hiii");
			  w2.click();
		
			  Thread.sleep(2000);
			  System.out.println(msg.getText());  
			  
//			  Thread.sleep(2000);
//			  System.out.println(msg);  
//			  
//			  
//			 
//			  w1.click();
//			  w1.sendKeys("asdad");
//			  w1.clear(); 
//			  w1.sendKeys("//Password123"); 
//			  
//			  Thread.sleep(2000);
//		  String s = we.getAttribute("value");
////			  
////			 System.out.println(s); System.out.println(we.isDisplayed());
////			  System.out.println(we.isEnabled()); System.out.println(we.isSelected());
////			 System.out.println(we.getLocation()); System.out.println(we.getSize());
//		  System.out.println(we.getTagName());
//		  System.out.println(we.getText());
////			 
//		 WebElement button = d.findElement(By.id("submit"));
//		 button.click();
//		
//		Thread.sleep(2000);
//		WebElement msg= d.findElement(By.id("error"));
//
//		Thread.sleep(2000);
//		System.out.println(msg.getText());
//		System.out.println("pw is invalid");
//		
//	
		 
		// d.findElement(By.id("username")).sendKeys("student");
		// d.findElements(By.id("username")).clear();
		// d.findElement(By.id("username")).click();
		 
		 
		 //d.findElement(By.id("password")).sendKeys("Password123");
	//	d.findElement(By.id("password")).clear();
		// d.findElement(By.id("password")).click();
		 
		 
		 
		
		 
		 
		 
		 
		 
		
		 

		 }
}
