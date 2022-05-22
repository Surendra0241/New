package pract;

  import org.openqa.selenium.By;
  import org.openqa.selenium.WebDriver;
  import org.openqa.selenium.WebElement;
  import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver=BrowserTest.test();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(rClick); //helps to right click on element
		act.perform();
		
		WebElement dClick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(dClick);//helps to double click on element
		act.perform();//help to perform the above mouse action
		
		
		
	}

}
