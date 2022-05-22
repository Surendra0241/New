package pract;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=BrowserTest.test();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	//WebElement Js= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
	//Js.click();
	
	
	//Thread.sleep(2000);
	WebElement JSP=driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]"));
	JSP.click();
	//JSP.sendKeys("YES");
	
	
	Alert a=driver.switchTo().alert();
	// a.sendKeys("Hello ..."); 
	//  a.accept();
	// a.dismiss();
	
	 System.out.println(a.getText());
}
}
