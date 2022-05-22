package pract;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //upcasting
		
		driver.get("https://www.youtube.com");
	    Thread.sleep(30000);
		
		driver.navigate().to("https://www.youtube.com");
		Thread.sleep(3000);      //3000 milisecond..
		driver.navigate().back();
		
		Thread.sleep(3000); 
		driver.navigate().forward();
		
		Thread.sleep(3000); 
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String expectedTitle="YouTube";
		
		if(title.equals(expectedTitle))
			{
				System.out.println("Yes Title is correct..");
			}
			else
			{
				System.out.println("Title is mismatched..");
			}
		     
		
		Dimension d =new Dimension(200, 400);
		driver.manage().window().setSize(d);

		Point p = new Point(500,600);
		driver.manage().window().setPosition(p);
		}
		
		}
	
	


