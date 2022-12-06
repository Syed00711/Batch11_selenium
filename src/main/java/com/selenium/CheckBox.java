package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//form[@id=\"checkboxes\"]/input[2]")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
