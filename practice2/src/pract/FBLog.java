package pract;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBLog {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
	WebDriver driver=BrowserTest.test();
	driver.get("https://www.facebook.com/");
	
	
	WebElement User=driver.findElement(By.xpath("//input[@id=\"email\"]"));
	String Sur=Excel.getData(0, 0, "FB");
    User.sendKeys(Sur);
	
	
	WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));
	Pass.click();
	
	WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
	login.click();
	

}
}