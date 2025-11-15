package com.test;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		
		WebDriver dd=new ChromeDriver();
		dd.get("https://demo.automationtesting.in/Static.html");
		
		WebElement ee=dd.findElement(By.id("col-xs-10 col-xs-offset-2"));
		Actions a=new Actions(dd);
		a.moveToElement(ee).contextClick();
		WebElement ee1=dd.findElement(By.id("angular"));
		WebElement ee2=dd.findElement(By.id("droparea"));
		a.dragAndDrop(ee1, ee2).build().perform();
		
		
		
		
		
	}

}
