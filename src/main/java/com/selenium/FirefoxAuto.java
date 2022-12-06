package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","/Users/sh030348/Downloads/geckodriver" );
        WebDriver driver =new EdgeDriver();

        driver.get("https://bstackdemo.com");
        Thread.sleep(5000);
        
        driver.close();
	}

}
