package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/infinite_scroll");
        WebElement scroll =driver.findElement(By.id("content"));
        
       /* WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(scroll);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 200)
                .perform();*/
        
        
        Thread.sleep(3000);
        
      //  new Actions(driver).scrollToElement(scroll).perform();
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, 500).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, 500).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, 500).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, -500).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, -500).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollFromOrigin(ScrollOrigin.fromElement(scroll), 0, -500).perform();
      /*  new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();
        Thread.sleep(1000);
        new Actions(driver).scrollByAmount(0, 200).perform();*/
        Thread.sleep(3000);
        
        driver.close();
        driver.quit();

	}

}
