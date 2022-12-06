package com.selenium;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "/Users/sh030348/download_file");
		File folder = new File("/Users/sh030348/download_file");
		if(!folder.exists()) {
			folder.mkdir();
		}
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);

        driver.get("http://the-internet.herokuapp.com/download");
        driver.findElement(By.xpath("//a[@href=\"download/Screenshot_20221124_102326.png\"]")).click();
        Thread.sleep(5000);
        
      //List the files on that folder
      File[] listOfFiles = folder.listFiles();
      boolean found = false;
      File f = null;
           //Look for the file in the files
           // You should write smart REGEX according to the filename
           for (File listOfFile : listOfFiles) {
               if (listOfFile.isFile()) {
                    String fileName = listOfFile.getName();
                     System.out.println("File " + listOfFile.getName());
                     if (fileName.matches("Screenshot_20221124_102326.png")) {
                         f = new File(fileName);
                         found = true;
                      }
                  }
              }
        System.out.println(found);
        driver.close();

	}

}
