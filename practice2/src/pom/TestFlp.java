package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestFlp {
	
	@Test
	public void Loginwithcredentials() throws EncryptedDocumentException, IOException {
		WebDriver driver=Browser.test("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		//driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		FlipLogin obj=new FlipLogin(driver);
		
		String User=Excel.getData(0, 1, "Flp");
		obj.enterusername(User);
		
		String Password=Excel.getData(1, 1, "Flp");
		obj.enterpass(Password);
		
	    obj.enteronlogin();
		
   }

	@Test
	public void LodinWithBlankCredentials() {
		WebDriver driver=Browser.test("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
	//	driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2Forders&fromMyOrdersPage=true");
		FlipLogin obj=new FlipLogin(driver);
		obj.enteronlogin();
				
	}
 
	
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		TestFlp obj= new TestFlp();
//		obj.Loginwithcredentials();
//		obj.LodinWithBlankCredentials();
		
		
//	}
}
