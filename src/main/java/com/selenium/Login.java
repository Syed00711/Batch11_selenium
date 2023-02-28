package seleniumB12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
   public static  WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/eclipse-workspace/selenium_testng/chromedriver");
	  driver  =new ChromeDriver();
        
        driver.get("https://www.bstackdemo.com/signin");
        Thread.sleep(2000);
        

	
		 driver.findElement(By.id("react-select-2-input")).sendKeys("demouser");
		   Thread.sleep(500);
		   driver.findElement(By.id("react-select-2-option-1")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//div[@id=\"password\"]//div[@class=\" css-1wa3eu0-placeholder\"]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("react-select-3-option-0-0")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.id("login-btn")).click();
		   Thread.sleep(1000);
		  System.out.println(driver.findElement(By.className("username")).getText());

	       driver.close();
		   
	}
	

}
