package pom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}
	
	@Test(enabled=false)
	public void testing() {
		System.out.println("Test Annotation");
	}
	
	@Test(dependsOnMethods= {"test2"})
	public void test() {
		System.out.println("Test");
	}
	
	@Test(priority = 1)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test(priority = -1, timeOut=3000)
	public void test2() throws InterruptedException {
		Thread.sleep(4000);
		System.out.println("Test2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println(" After test");
	}
	

}
