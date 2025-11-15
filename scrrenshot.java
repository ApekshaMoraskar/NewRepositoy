package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class scrrenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver dp=new ChromeDriver();
		dp.get("https://www.google.com");
	  File sc=((TakesScreenshot)dp).getScreenshotAs(OutputType.FILE);
	  Files.copy(sc, new File("C:\\Users\\CDAC\\Pictures\\Screenshots\\src.png"));
	  
	  
				
	   
				
				

	}

}
