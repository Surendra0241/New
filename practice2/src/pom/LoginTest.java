package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	@BeforeClass
	public void before() {
		System.out.println("Testing has started");
	}
	
	@AfterClass
	public void after() {
		System.out.println("Testing ended");
	}
	
	@Test
	public void loginWithValidCredentials() throws EncryptedDocumentException, IOException {
		WebDriver driver= Browser.test("https://kite.zerodha.com/");
		Zerodha obj=new Zerodha(driver);
		
		
		String userId=Excel.getData(0, 1, "Credentials");
		obj.EnterUserId(userId);
		
		String Pass=Excel.getData(1, 1, "Credentials");
		obj.enterPassword(Pass);
		
		obj.clickOnSubmit();
		
	}
	
	@Test
	public void loginWithBlankCredentials() {
		WebDriver driver=Browser.test("https://kite.zerodha.com/");
		Zerodha obj=new Zerodha(driver);
		obj.clickOnSubmit();
		
	}

}
