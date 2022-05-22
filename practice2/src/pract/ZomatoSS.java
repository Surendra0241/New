package pract;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZomatoSS {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= BrowserTest.test();
		driver.get("https://www.zomato.com/");
	    TakeScreenshot.getScreenshot(driver,"Zomato");
		
		WebElement login= driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		
		Thread.sleep(2000);
		
      	WebElement phonenumber =driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
        
  
      	phonenumber.sendKeys("1234567890");
	
	    TakeScreenshot.getScreenshot(driver,"Zomato");
	    

		WebElement button = driver.findElement(By.xpath("//button[@role=\"button\"])[2]"));
		System.out.println(button.isEnabled());
		


		phonenumber.sendKeys("9876543210");
		TakeScreenshot.getScreenshot(driver,"Signup");
	
		System.out.println(button.isEnabled());
		
	}

}
