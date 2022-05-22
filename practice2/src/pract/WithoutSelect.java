package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WithoutSelect {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown'][1]"));
		selenium.click();
		
		WebElement table=driver.findElement(By.xpath("//a[text()='Table Demo']"));
		table.click();
		
	}

}
