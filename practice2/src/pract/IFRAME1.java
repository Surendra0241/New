package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFRAME1 {
public static void main(String[] args) {
	WebDriver driver=BrowserTest.test();
	driver.get("http://demo.automationtesting.in/Frames.html");
	
	WebElement doubleframe=driver.findElement(By.xpath("//a[@href=\"#Multiple\"]"));
	doubleframe.click();
	
	WebElement outFrame=driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
	driver.switchTo().frame(outFrame);//will switch to outer iframe
	
	WebElement iframe=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
	driver.switchTo().frame(iframe); //switch to inner iframe
	
	WebElement input=driver.findElement(By.xpath("//input[@type=\"text\"]"));
	input.sendKeys("Velocity");
	
	driver.switchTo().defaultContent(); //switch the focus of selenium to main page
	
	WebElement webTable=driver.findElement(By.xpath("//a[@href=\"WebTable.html\"]"));
	webTable.click();
	
	
}
}
