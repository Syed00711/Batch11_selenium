package com.selenium;

import java.time.Duration;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v106.network.Network;
import org.openqa.selenium.devtools.v106.network.model.Headers;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/git/BStackDemo/chromedriver");
		ChromeDriver driver = new ChromeDriver();
   
     // Authentication username & password
      /*  String username = "admin";
        String password = "admin";

        // Get the devtools from the running driver and create a session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Enable the Network domain of devtools
        devTools.send(Network.enable(Optional.of(100000), Optional.of(100000), Optional.of(100000)));
        String auth = username + ":" + password;

        // Encoding the username and password using Base64 (java.util)
        String encodeToString = Base64.getEncoder().encodeToString(auth.getBytes());

        // Pass the network header -> Authorization : Basic <encoded String>
        Map<String, Object> headers = new HashMap<>();
        headers.put("Authorization", "Basic " + encodeToString);
        devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));*/
		
        // Load the application url
       driver.get("https://admin:admin@the-internet.herokuapp.com");
       driver.findElement(By.xpath("//a[@href=\"/basic_auth\"]")).click();
     //a[@href="/basic_auth"]
       
       System.out.println(driver.findElement(By.xpath("//p")).getText());
       
        Thread.sleep(2000);        
        driver.close();


	}

}
