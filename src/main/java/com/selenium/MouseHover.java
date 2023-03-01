package seleniumB12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/eclipse-workspace/selenium_testng/chromedriver");
		WebDriver  driver  =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/disappearing_elements");
		WebElement element=driver.findElement(By.xpath("//a[text()=\"Home\"]"));
		System.out.println(element.getCssValue("color"));
		Thread.sleep(2000);
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//a[text()=\"Home\"]")).getCssValue("color"));
		
		WebElement element1=driver.findElement(By.xpath("//a[text()=\"About\"]"));
		action.moveToElement(element1).perform();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//a[text()=\"About\"]")).getCssValue("color"));
		
		driver.quit();

	}

}
