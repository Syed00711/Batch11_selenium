package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicLoading {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        
        System.out.println(driver.findElement(By.id("finish")).getCssValue("display"));
        driver.findElement(By.cssSelector("#start button")).click();
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.id("finish")).getCssValue("display"));
        driver.close();

	}

}
