package pract;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSize {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");

		
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Dimension d= new Dimension(300,500);
	driver.manage().window().setSize(d);
	
	Point p= new Point(1000,1000);
	driver.manage().window().setPosition(p);	
	
	}

}
