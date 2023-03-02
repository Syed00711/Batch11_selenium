package seleniumB12;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sh030348/Downloads/eclipse-workspace/selenium_testng/chromedriver");
		WebDriver  driver  =new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		
		Dimension newDi =new Dimension(600,800);
		driver.manage().window().setSize(newDi);
		
		/*Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		Thread.sleep(1000);
		String origintab =driver.getWindowHandle();
		System.out.println(origintab);
		driver.findElement(By.xpath("//a[text()=\"Elemental Selenium\"]")).click();
		Thread.sleep(2000);
		Set<String> handles = driver.getWindowHandles();
		String secondtab=null;
		for(String handle:handles) {
			if(!handle.equalsIgnoreCase(origintab)) {
				secondtab=handle;
			}
		}
		
		
		
		System.out.println(secondtab);
		driver.switchTo().window(secondtab);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(origintab);
		Thread.sleep(2000);
		driver.switchTo().window(secondtab).close();
		Thread.sleep(2000);
		driver.quit();
	}

}
