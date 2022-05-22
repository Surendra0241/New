package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.facebook.com/");
		
		WebElement create=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		
		Thread.sleep(3000);
		
		WebElement firstname= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		firstname.sendKeys("Velocity");
	}

}
