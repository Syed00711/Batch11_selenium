package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputStatus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        
        System.out.println(driver.findElement(By.xpath("//form[@id=\"input-example\"]/input")).isEnabled());
        
        driver.findElement(By.xpath("//form[@id=\"input-example\"]/button")).click();
        System.out.println(driver.findElement(By.xpath("//form[@id=\"input-example\"]/button")).
        		getAttribute("disabled"));
        Thread.sleep(6000);
        System.out.println(driver.findElement(By.xpath("//form[@id=\"input-example\"]/input")).isEnabled());
        
        
        driver.close();

	}

}
