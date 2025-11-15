package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr =new ChromeDriver(); // to open chrome browser
		WebDriver ff = new FirefoxDriver(); // to open Firefox brower
		WebDriver ie = new InternetExplorerDriver(); // to open Internet Explorer
		WebDriver hd = new EdgeDriver(); // to open EdgeDriver 
		dr.get("https://www.google.com");
		String s= "https://www.google.com";
		dr.get(s);
		dr.manage().window().maximize();
		dr.manage().window().minimize();
		Thread.sleep(4000);
		System.out.println(dr.getTitle());
		dr.close();
		

	}

}
