package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        
        String orighandle =driver.getWindowHandle();
        
        driver.findElement(By.xpath("//a[@href=\"/windows/new\"]")).click();
        
        Thread.sleep(2000);
        String newhandle = driver.getWindowHandle();
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        Thread.sleep(2000);
        
        driver.switchTo().window(orighandle);
       
        
        Thread.sleep(2000);
        driver.close();
        driver.quit();

	}

}
