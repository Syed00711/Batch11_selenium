package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("hot-spot"));
		actions.contextClick(elementLocator).perform();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}



/*Actions actions = new Actions(driver);
WebElement elementLocator = driver.findElement(By.id("ID"));
actions.doubleClick(elementLocator).perform();*/