package com.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/hovers");
       WebElement image= driver.findElement(By.xpath("//div[@class=\"example\"]/div[1]/img"));
    
       WebElement image1= driver.findElement(By.xpath("//div[@class=\"example\"]/div[2]/img"));
    
       WebElement image2= driver.findElement(By.xpath("//div[@class=\"example\"]/div[3]/img"));
      
       Actions action =new Actions(driver);
       action.moveToElement(image).perform();
       Thread.sleep(2000);
       action.moveToElement(image1).perform();
       Thread.sleep(2000);
       action.moveToElement(image2).perform();
       Thread.sleep(2000);
        
        
        driver.close();

	}

}
