package pract;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialCls {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //upcasting
	
	driver.get("https://www.youtube.com");
}
}