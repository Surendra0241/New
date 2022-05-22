package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Zomato {
public static void main(String[] args) throws InterruptedException {
   WebDriver driver=BrowserTest.test();
   driver.get("https://www.zomato.com/");
   WebElement login=driver.findElement(By.xpath("//a[text()='Log in']"));
   login.click();
       
       Thread.sleep(3000);
       
       WebElement phoneNumber=driver.findElement(By.xpath("//input[@placeholder='Phone number']"));
       
       WebElement button=driver.findElement(By.xpath("//button[@role=\"button\"][2]"));
       System.out.println(button.isEnabled());
       
       phoneNumber.sendKeys("");
       
       System.out.println(button.isEnabled());
       
      
	}
}
