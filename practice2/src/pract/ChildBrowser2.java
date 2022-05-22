package pract;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser2 {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://vctcpune.com/");
		
		WebElement selenium=driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		selenium.click();
		selenium.click();
		selenium.click();
		
		
		ArrayList<String> list= new ArrayList(driver.getWindowHandles());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i=1; i<list.size();i++)
		{
			driver.switchTo().window(list.get(i));
			WebElement radio= driver.findElement(By.xpath("//input[@value=\"Radio2\"]"));
			radio.click();
		}
	
	
	
	
	
	
	}
  

}
