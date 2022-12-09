package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicControls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//div[@id=\"checkbox\"]/input")).click();
        driver.findElement(By.xpath("//form[@id=\"checkbox-example\"]/button")).click();
        
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.id("message")).getText());
        driver.findElement(By.xpath("//form[@id=\"checkbox-example\"]/button")).click();
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.id("message")).getText());
        driver.close();

	}

}
