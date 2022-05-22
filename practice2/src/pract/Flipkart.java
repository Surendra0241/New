package pract;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.flipkart.com/");
		
		WebElement Title= driver.findElement(By.name("q"));
		Title.sendKeys("mobiles");
		Title.click();
		
		WebElement search= driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]"));//class="L0Z3Pu"
     	search.click();
		
	//	WebElement submit= driver.findElement(By.)
		
		
		//userName.sendKeys("Maharashtra");
		
		//WebElement password= driver.findElement(By.name("password"));
		//password.sendKeys("Vikas");
		
		//WebElement login=driver.findElement(By.tagName("button"));
		
		
		
	}

}
