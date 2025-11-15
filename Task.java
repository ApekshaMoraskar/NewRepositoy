package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr= new ChromeDriver();
		WebDriver ff= new FirefoxDriver();
		dr.get("https://www.google.com");
		
		
		ff.get("https://www.gmail.com");
		
	
		dr.manage().window().maximize();
		dr.manage().window().minimize();
		System.out.println(dr.getTitle());
		System.out.println(dr.getCurrentUrl());
		String s= dr.getTitle();
		String s1=dr.getCurrentUrl();
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("fail");
		}
		ff.close();
		
		
		
		
		

	}

}
