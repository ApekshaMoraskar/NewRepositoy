package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop1 {

	public static void main(String[] args) {
		
		WebDriver dl=new ChromeDriver();
		dl.get("https://demo.guru99.com/test/drag_drop.html");
		System.out.println(dl.getTitle());
		
		WebElement e1=dl.findElement(By.id("button button-orange"));
		Actions a=new Actions(dl);
		a.moveToElement(e1).contextClick();
		WebElement e2=dl.findElement(By.id("button button-orange"));
		Actions a2=new Actions(dl);
		a.moveToElement(e2).contextClick();
		WebElement e3=dl.findElement(By.id("center"));
		Actions a3 =new Actions(dl);
		
		
		
		
		
		

	}

}
