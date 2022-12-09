package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/iframe");
        
       driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
       System.out.println( driver.findElement(By.id("tinymce")).getText());
       driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//div[@class=\"example\"]/h3")).getText());
        
        
        
        driver.close();

	}

}
