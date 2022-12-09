package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
	
		String text = driver.findElement(By.tagName("body")).getText();
		System.out.println(text);
		
		///System.out.println(driver.findElement(By.name("frame-left")).getDomAttribute("body"));
		driver.switchTo().defaultContent();
		driver.close();

	}

}
