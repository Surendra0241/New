package pract;

import java.io.File;
import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {
	public static void getScreenshot(WebDriver driver,String name) throws IOException
	{
		
	 //   String d=	Date.date();       
		String d = TakeScreenshot.date();
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("E:\\SeleniumSS\\"+name+""+d+".jpg");

		FileHandler.copy(source,destination);
	}
	
     	public static String date() {
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss");     //format the time date and time as required
	    LocalDateTime now= LocalDateTime.now();
	    String d= dtf.format(now);
	    return d;

 }
}

