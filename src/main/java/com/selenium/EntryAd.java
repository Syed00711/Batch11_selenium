package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntryAd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/entry_ad");

        Thread.sleep(3000);
        
        Set<String> wnd = driver.getWindowHandles();
        // window handles iteration
        Iterator<String> i = wnd.iterator();
        String prntw = i.next();
        String popwnd = i.next();
        // switching pop up window handle id
        driver.switchTo().window(popwnd);
        System.out.println("Page title of popup: "+ driver.getTitle());
        driver.close();
        driver.switchTo().window(prntw);
        System.out.println("Page title : "+ driver.getTitle());
        
        driver.close();

	}

}
