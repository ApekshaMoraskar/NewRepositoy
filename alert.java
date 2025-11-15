package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws InterruptedException {
	     
		WebDriver dr1=new  ChromeDriver();
		dr1.get("https://demo.automationtesting.in/Alerts.html");
		dr1.manage().window().maximize();
		
		dr1.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Alert ao= dr1.switchTo().alert();
		Thread.sleep(3000);
		ao.accept();
		
		
		
		
		
		
		
	}

}
