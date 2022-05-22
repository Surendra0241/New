package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hidden {
public static void main(String[] args) {
	WebDriver driver=BrowserTest.test();
	driver.get("https://www.facebook.com/");
	
	WebElement create =driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	create.click();
	
	WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
    Firstname.sendKeys("Surendra");
    Firstname.click();
    
	//WebElement Lastname=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
	//Lastname.sendKeys("Dahatonde");
	
}
}
