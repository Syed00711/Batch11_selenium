package com.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		driver =new ChromeDriver();
		
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.close();

	}

}
