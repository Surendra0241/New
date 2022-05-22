package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFRAME {
  public static void main(String[] args) {
    WebDriver driver=BrowserTest.test();
    driver.get("http://demo.automationtesting.in/Frames.html");
    
    WebElement iframe=driver.findElement(By.xpath("//iframe[@name=\"SingleFrame\"]"));
    
    driver.switchTo().frame(iframe); //switch selenium focus to iframe
    
    WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
    input.sendKeys("Velocity");
}
	
	
}
