package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        
        
        driver.close();

	}

}
