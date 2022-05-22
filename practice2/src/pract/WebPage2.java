package pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPage2 {
	public static void main(String[] args) {
	 WebDriver driver=	BrowserTest.test();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 
	 WebElement heading= driver.findElement(By.xpath("//a[contains(@class,'navbar-brand')]"));
	 String text=heading.getText();
	 System.out.println(text);
	 String actualText="VELOCITY CORPORATE TRAINING";
	 
	 if(text.equals(actualText))
	 {
		 System.out.println("Text are matching");
	 }
	 else
	 {
		 System.out.println("Text mismatch");
	 }
	 
	}

}
