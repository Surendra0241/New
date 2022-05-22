package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(iframe);
		
		WebElement source=driver.findElement(By.xpath("//li[contains(@class, 'ui-widget-content ')][1]"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, destination);
		act.perform();
		
		
		
		
		
	}

}
