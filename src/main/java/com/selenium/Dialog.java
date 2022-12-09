package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dialog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/entry_ad");
        
        System.out.println(driver.findElement(By.id("modal")).getAttribute("style"));
        System.out.println(driver.findElement(By.id("modal")).getCssValue("display"));
        System.out.println(driver.findElement(By.id("modal")).getCssValue("font-family"));
       
        
        
        
        
        driver.close();
        

	}

}
