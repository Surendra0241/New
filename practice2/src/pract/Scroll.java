package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://demoqa.com/text-box");
		
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",submit);
		
		Thread.sleep(2000);
		JavascriptExecutor execute= (JavascriptExecutor)driver;
		execute.executeScript("window.scrollBy(300,200");
	}

}
