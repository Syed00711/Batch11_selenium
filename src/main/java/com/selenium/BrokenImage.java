package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		WebDriver driver = new ChromeDriver();
		String URL = "https://the-internet.herokuapp.com/broken_images";
		driver.get(URL);
		
		String width =driver.findElement(By.xpath("//img[@src=\"img/avatar-blank.jpg\"]")).getAttribute("naturalWidth");
		
		System.out.println(width);
		
		
		/*String status = "passed";
		int iBrokenImageCount = 0;
		try {
		
        List<WebElement> image_list = driver.findElements(By.tagName("img"));
      
        System.out.println("The page under test has " + image_list.size() + " images");
        for (WebElement img : image_list)
        {
            if (img != null)
            {
                if (img.getAttribute("naturalWidth").equals("0"))
                {
                    System.out.println(img.getAttribute("outerHTML") + " is broken.");
                    iBrokenImageCount++;
                }
            }
        }
    }
    catch (Exception e)
    {
     
        System.out.println(e.getMessage());
    }
    status = "passed";
    System.out.println("The page " + URL + " has " + iBrokenImageCount + " broken images");
    */
    driver.close();

	}

}
