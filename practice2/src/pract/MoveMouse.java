package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.amazon.in");
		WebElement signIn=driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(signIn);
		act.perform();
		
		WebElement prime=driver.findElement(By.xpath("//span[text()='Your Prime Video']"));
		act.click(prime);
		act.perform();
	}


}
