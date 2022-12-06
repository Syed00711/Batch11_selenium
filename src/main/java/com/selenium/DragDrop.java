package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		Actions actions = new Actions(driver);
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
	//	actions.dragAndDrop(source, target).perform();
	//	System.out.println("first drag");
		Thread.sleep(3000);
		
		actions.clickAndHold( source).moveToElement( target).release().perform();
		Thread.sleep(3000);
	//	actions.dragAndDrop(target,source).perform();
	//	System.out.println("second drag");
	//	Thread.sleep(3000);
		driver.close();

	}

}
