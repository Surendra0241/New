package pract;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebP {
	public static void main(String[] args) throws IOException {
		WebDriver driver= BrowserTest.test();
		driver.get("https://vctcpune.com/selenium/practice.html");
	  WebElement drop=  driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
	  Select obj=new Select(drop);
	  
	  
	//  obj.selectByValue("option1");
	  obj.selectByVisibleText("Option2");
	//  obj.selectByIndex(")
	  
	    
				
	}

}
