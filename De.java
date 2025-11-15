package com.test;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class De {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.google.com");
		Thread.sleep(2000);
		WebDriver fd=new FirefoxDriver();
		fd.get("https://www.gmail.com");
		Thread.sleep(4000);
		
	//	dr.navigate();
		dr.navigate().back();
		System.out.println(dr.manage().window().getSize());
		dr.manage().window().maximize();
	    dr.manage().window().minimize();
		/*
		 * Dimension d = new Dimension(500, 750); 
		 * fd.manage().window().setSize(d);
		 * 
		 */
	    
		
		
		
		
		
		
}
}

