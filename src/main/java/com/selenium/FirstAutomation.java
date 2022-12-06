package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bstackdemo.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("signin")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("react-select-2-input")).sendKeys("demouser"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("react-select-3-input")).sendKeys("testingisfun99"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.id("login-btn")).click();
        Thread.sleep(4000);
	driver.close();
	
	}

}
