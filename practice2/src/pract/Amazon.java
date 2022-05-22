package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	//	WebElement search = driver.findElement(By.xpath("//a[text()=twotabsearchtextbox']"));           //xpath by text
	//  
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	//	WebElement search = driver.findElement(By.xpath("//input[name()='field-keywords']"));
		search.sendKeys("Mobile");
		search.click();
	//	WebElement submit=driver.findElement(By.id("nav-search-submit-button"));
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));                   //xpath by attributes 
		submit.click();
	
		
	}

}

