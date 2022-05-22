
package pract;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LinksSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		List<WebElement> source=driver.findElements(By.xpath("//li[contains(@class, 'ui-widget-content ')][1]"));
		
		WebElement destination=driver.findElement(By.xpath("//div[@id=\"trash\"]"));
		Actions act=new Actions(driver);
		
		for(int i=0;i<source.size();i++)
		{
			act.dragAndDrop(source.get(i), destination);
			act.perform();
			Thread.sleep(1000);
		}
		List<WebElement>links=driver.findElements(By.tagName("li"));
		System.out.println(links.size());
		
			
	}

}
