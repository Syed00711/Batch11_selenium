package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_content");
		System.out.println(driver.findElement(
				By.xpath("//div[@id=\"content\"]/div[3]/div[@class=\"large-10 columns\"]")).
				getText());
		Thread.sleep(2000);
		System.out.println("==========================");
		driver.findElement(By.xpath("//a[@href=\"/dynamic_content?with_content=static\"]")).click();;
		
		System.out.println(driver.findElement(
				By.xpath("//div[@id=\"content\"]/div[3]/div[@class=\"large-10 columns\"]")).
				getText());
		System.out.println("==========================");
driver.findElement(By.xpath("//a[@href=\"/dynamic_content?with_content=static\"]")).click();;
		
		System.out.println(driver.findElement(
				By.xpath("//div[@id=\"content\"]/div[3]/div[@class=\"large-10 columns\"]")).
				getText());
		
		System.out.println("==========================");
		driver.close();

	}

}
