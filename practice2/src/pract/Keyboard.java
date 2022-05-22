package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://demoqa.com/text-box");
		
		Actions act=new Actions(driver);
		
		WebElement fullname=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		fullname.sendKeys("Surendra");
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.sendKeys("sdtest@gmail.com");
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.sendKeys("Nagar Pune");
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("c");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    
	    act.sendKeys(Keys.TAB);
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("v");
	    act.keyUp(Keys.CONTROL);
	    act.build().perform();
	    
//	    WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
//	    submit.click();
//	    act.click(submit);
//	    act.perform();
	    
	    act.sendKeys(Keys.TAB);
	    act.perform();
	    act.sendKeys(Keys.ENTER);
	    act.perform();
	    
	    
	    
	}

}
