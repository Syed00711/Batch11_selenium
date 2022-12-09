package com.selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/horizontal_slider");
		WebElement slider = driver.findElement(By.tagName("input"));
		System.out.println(slider.getAttribute("value"));
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
slider.sendKeys(Keys.RIGHT);
Thread.sleep(1000);
System.out.println(slider.getAttribute("value"));


		
		driver.close();

	}

}
