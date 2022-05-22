package pract;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Maximise_Min{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\SELENIUM\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); //upcasting
			
			driver.get("https://www.youtube.com");
		    Thread.sleep(3000);
		    
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.manage().window().minimize();
		    
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.manage().window().maximize();
		    
}
}