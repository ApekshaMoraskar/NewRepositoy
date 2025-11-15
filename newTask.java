package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class newTask {

	public static void main(String[] args) {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		String s=dr.getWindowHandle();
		dr.get("www.google.com");
		
		
		dr.switchTo().newWindow(WindowType.TAB);
		
		
		String ss=dr.getWindowHandle();
		
	    WebDriver ff=new FirefoxDriver();
		
	    WebDriver gh=new InternetExplorerDriver();
	
		
		
		
		ff.get("www.Firefox.com");
		gh.get("www.InternetExlorer.com");
		
		
		
		//dr.close();
		

	}

}
