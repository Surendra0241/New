package pract;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser1 {
public static void main(String[] args) throws IOException {
	 WebDriver driver= BrowserTest.test();
	 driver.get("https://dypatiluniversitypune.edu.in/school-of-engineering-ambi.php");
	 
	WebElement School=driver.findElement(By.xpath("//a[@href=\"http://dypatilhighschool.com/\"]"));
	School.click();
	
    TakeScreenshot.getScreenshot(driver,"College");
    
	WebElement Campus=driver.findElement(By.xpath("//a[@href=\"http://dyptc.com/\"]"));
	Campus.click();
	
    WebElement Sport=	driver.findElement(By.xpath("//a[@href=\"http://dypatil.edu/sportsacademy/\"]"));
	Sport.click();
	 
	
	ArrayList<String> list= new ArrayList(driver.getWindowHandles());
	System.out.println(list.get(0));    //main page address
	System.out.println(list.get(1));    //last page..sport page open
	System.out.println(list.get(2));    //second page..campus page open
    System.out.println(list.get(3));    //first page..school page open
    
    driver.switchTo().window(list.get(3));
    WebElement Y= driver.findElement(By.xpath("(//a[@href=\"http://dypatilhighschool.com/why-dyphs/\"])[2]"));
    Y.click();
    
    TakeScreenshot.getScreenshot(driver,"College");
    
    
    
}

}
