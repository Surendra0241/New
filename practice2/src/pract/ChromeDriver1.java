package pract;

public class ChromeDriver1 implements Webdriver{
 public void test2() {
	 System.out.println("method from Webdriver");
 }
 
	 public void test3() {
		 System.out.println( " 2nd method from Webdriver");
	 }
	 public void test4(){
		 System.out.println( " method from Webdriver");
	 }
	 public static void main(String[] args) {
		Webdriver Driver= new ChromeDriver1();
		Driver.test3();
//		driver.get("https://www.youtube.com");
		
		
	}
	 

	 
	 
	 
	}
 


