package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
         driver.findElement(By.xpath("//a[@href=\"/add_remove_elements/\"]")).click();
         driver.findElement(By.xpath("//div[@class=\"example\"]/button")).click();
        WebElement element= driver.findElement(By.xpath("//button[@class=\"added-manually\"]"));
        System.out.println(element.getText());
        element.click();
        


        try {
        driver.findElement(By.xpath("//button[@class=\"added-manually\"]"));
        }catch(Exception e) {
        	System.out.println("Delete button not found");
        }
        
        
        Thread.sleep(2000);        
        driver.close();

	}

}
