package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/dropdown");
		Select opt =new Select(driver.findElement(By.id("dropdown")));
		opt.selectByValue("2");
		Thread.sleep(3000);
		opt.selectByVisibleText("Option 1");
		Thread.sleep(3000);
		opt.selectByIndex(2);
		Thread.sleep(3000);
		driver.close();

	}

}
