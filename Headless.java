package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless {

	public static void main(String[] args) {
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("incognito");
		WebDriver dr2= new ChromeDriver(co);
		dr2.get("https://www.google.com");
		System.out.println(dr2.getTitle());
		
		FirefoxOptions co1 = new FirefoxOptions();
		co1.addArguments("incognito");
		
		
		WebDriver dr3= new FirefoxDriver();
		dr3.get("https://www.firefox.com");
		System.out.println(dr3.getTitle());
		
		
		
		
		

	}

}
