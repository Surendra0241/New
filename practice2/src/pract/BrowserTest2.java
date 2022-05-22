package pract;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserTest2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver= BrowserTest.test();
			driver.get("https://www.facebook.com/");
			TakeScreenshot.getScreenshot(driver,"FB");
		
			WebElement user=driver.findElement(By.name("email"));
		
			user.sendKeys("Surendra Dahatonde");
			TakeScreenshot.getScreenshot(driver,"FB");

			
			WebElement password=driver.findElement(By.id("pass"));
			password.sendKeys("Daha1717");
			TakeScreenshot.getScreenshot(driver,"FB");

			
			WebElement login=driver.findElement(By.tagName("button"));
			TakeScreenshot.getScreenshot(driver,"FB");
			login.click();
			TakeScreenshot.getScreenshot(driver,"FB");

			
			
	}

}
