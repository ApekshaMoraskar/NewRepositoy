package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Demo {
	
	public static void main(String[]args)

	{
		WebDriver d=new  ChromeDriver();
		d.get("https://accounts.saucelabs.com/am/XUI/#login/");
		System.out.println(d.getTitle());
		WebElement txtbox=d.findElement(By.id("idToken1"));
		Actions a=new Actions(d);
		a.moveToElement(txtbox).contextClick().build().perform();
		txtbox.sendKeys("Kuch kuch hota hai");
		a.doubleClick(txtbox).build().perform();
		
		
				
		
		
		
	}

}
