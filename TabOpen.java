package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabOpen {

	public static void main(String[] args)
	{
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		String pw=dr.getWindowHandle();
		dr.get("https://www.google.com");
	

	
		dr.switchTo().newWindow(WindowType.TAB);
		String cw=dr.getWindowHandle();
		dr.get("https://www.gmail.com");
		dr.switchTo().window(pw);
		
		
	}
}
