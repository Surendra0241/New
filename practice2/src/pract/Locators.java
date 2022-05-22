package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//WebElement email= driver.findElement(By.xpath("//input[@id='email'"));  //xpath by attributes
	//email.sendKeys("Velocity");
	
	//WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));     //xpath by text
	//forgot.click();
	
	//WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));           //xpath by text
	//create.click();
	
	WebElement create= driver.findElement(By.xpath("//a[contains(@data-testid,'open-')]"));
	create.click();
	}

	//tagname[attribute="attributeValue"]...for CSS
	
	//tagname[@attribute=“attributeValue”]...for attribute
	//tagname[text()=“textValue”]......for text
	//tagname[contains(@attribute,partialAttributeValue)]....by contains
	//(Any Xpath Expression)[index].........by index 

	
	
	
}
