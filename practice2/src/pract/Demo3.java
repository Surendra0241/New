package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Demo3 {
	public static void main(String[] args)throws InterruptedException  {
		WebDriver driver=BrowserTest.test();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement Hide=driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		Hide.click();
		
		try {
			
	    WebElement firstName=driver.findElement(By.xpath("id=\"displayed-text\""));
		firstName.sendKeys("India");
		}catch(Exception e)
		{
		   System.out.println(e); 	
		}
		finally {
			
		}
		
		WebElement radio=driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
		radio.click();	   
	}

}
