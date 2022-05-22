package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage1 {
	public static void main(String[]args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement radio1=driver.findElement(By.xpath("//input[@value=\"Radio1\"]"));
		
		WebElement radio2=driver.findElement(By.xpath("//input[@value=\"Radio2\"]"));
		radio2.click();
		
		Boolean result=radio1.isSelected();
		System.out.println( result);
	}

}
