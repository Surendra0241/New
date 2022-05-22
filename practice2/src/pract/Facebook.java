package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userName= driver.findElement(By.cssSelector("input[name='email']"));     //locator by css
				userName.sendKeys("Velocity");
				
				WebElement pass= driver.findElement(By.cssSelector("input[name='pass']"));    //by name
				pass.sendKeys("Katraj");
				
//				WebElement login = driver.findElement(By.tagName("button"));          //by tagname
//				login.click();
				
			//	WebElement forgot = driver.findElement(By.className("_6ltj"));
			//	forgot.click();
				
			//	WebElement forgot= driver.findElement(By.linkText("Forgotten password?"));
			//	forgot.click();
		
//			    WebElement log=driver.findElement(By.xpath("//button[@id=\"loginbutton\"]"));
//			    log.click();
			    
				WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
				login.click();
				
	}
}

