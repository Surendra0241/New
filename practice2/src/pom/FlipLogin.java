package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipLogin {
	
	@FindBy(xpath="(//input[@autocomplete='off'])[2]")private WebElement UserName;
	@FindBy(xpath="//input[@type='password']")private WebElement Pass;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement Login;
	
	public FlipLogin (WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	public void enterusername(String Mob) {
	    UserName.sendKeys(Mob);
	}
	
	public void enterpass(String Pss) {
		Pass.sendKeys(Pss);
	}
	
	public void enteronlogin() {
		Login.click();
	}

}
