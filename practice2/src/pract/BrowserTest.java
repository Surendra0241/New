package pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  BrowserTest {
	public static WebDriver test() {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.get("url");
		return driver;
	}

}
