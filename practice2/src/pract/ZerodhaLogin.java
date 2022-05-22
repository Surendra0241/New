package pract;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ZerodhaLogin {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=BrowserTest.test();
		driver.get("https://kite.zerodha.com/");
		
		String userName=Excel.getData(0, 1, "Credentials");
		String password=Excel.getData(1, 1,"Credentials");
		String pinCode=Excel.getData(2, 1, "Credentials");
		
		WebElement userId=driver.findElement(By.xpath("//input[@id=\"userid\"]"));
		userId.sendKeys(userName);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pass.sendKeys(password);
		
		WebElement submit=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		submit.click();
		
		Thread.sleep(1000);
		WebElement pin=driver.findElement(By.xpath("//input[@id='pin']"));
		pin.sendKeys(pinCode);
		
		WebElement ok=driver.findElement(By.xpath("//button[@type='submit']"));
		ok.click();
		
		
		
	}

}
