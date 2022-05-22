package pract;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://vctcpune.com/");
		
	 WebElement Practice=driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		Practice.click();
		Thread.sleep(5000);
		Practice.click();
		Thread.sleep(5000);
		Practice.click();

		
		Set <String> addresses= driver.getWindowHandles();
		Iterator <String> i=addresses.iterator();
		System.out.println(addresses);
	

		
		while(i.hasNext())
		{
		 String window=	i.next();
		 driver.switchTo().window(window);
		 String pageTitle = driver.getTitle();
		 String expectedTitle= "Practice Page";
		 if(pageTitle.equals(expectedTitle))
		 {
			 WebElement radio=driver.findElement(By.xpath("//input[@value=\"Radio3\"]"));
			 radio.click();
		 }
		 
				
		}
		
	}

}
