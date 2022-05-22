package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class DropDown {
public static void main(String[] args) {
	WebDriver driver= BrowserTest.test();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
    WebElement option= driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
    
    Select obj= new Select(option);
    
  //   obj.selectByValue("option1");
   //  obj.selectByIndex(3);
     obj.selectByVisibleText("option2");
    
    
}
}
