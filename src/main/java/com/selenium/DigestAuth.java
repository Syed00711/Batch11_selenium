package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.chrome.ChromeDriver;

public class DigestAuth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		ChromeDriver driver = new ChromeDriver();
   
    
		HasAuthentication authentication = (HasAuthentication) driver;
		authentication.register(() -> new UsernameAndPassword("admin", "admin"));
		driver.get("https://the-internet.herokuapp.com/digest_auth");

     
       System.out.println(driver.findElement(By.xpath("//p")).getText());
       
        Thread.sleep(2000);        
        driver.close();

	}

}
