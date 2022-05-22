package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//input[@id=\"email\"]"));
		email.sendKeys("Velocity");
		Thread.sleep(2000);
		
		email.clear();
	}

}
