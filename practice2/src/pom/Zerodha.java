package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodha {

		@FindBy(xpath="//input[@id='userid']")private WebElement userId;
		@FindBy(xpath="//input[@placeholder='Password']")private WebElement Pass;
		@FindBy(xpath="//button[@type='submit']")private WebElement submit;
		
		public Zerodha(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		public void EnterUserId(String id) {
			userId.sendKeys(id);
		}
		
		public void enterPassword(String pass){
			Pass.sendKeys(pass);
		}
		
		public void clickOnSubmit() {
			submit.click();
		}
		
		
		
		
	}


