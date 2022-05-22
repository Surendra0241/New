package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newclass {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		
		WebElement username=driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));
		username.sendKeys("Surendra");
		
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234");
		
		WebElement submit=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]"));
		submit.click();
		
		
		
	}

}
