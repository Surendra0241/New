package pom;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecution {
	
	@BeforeClass     //only once at the start of execution
	public void beforeClass() {
		System.out.println("Before class");
		}
	
	@AfterClass     //run at the end of execution
	public void afterClass() {
		System.out.println("After class");
	}
	
	@BeforeMethod    //will run after every @TEST annotation
	public void beforeMethof() {
		System.out.println("Before method");
	}
	
	@AfterMethod       //will run before every @TEST annotation
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test              //test are writtern under this
	public void test() {
		System.out.println("Test completed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 Completed");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3 completed");
	}
	
	@BeforeTest      //will run before @BeforeClass
	public void beforeTest() {
		System.out.println("Before test");
	}
	
	@AfterTest       //will run after @afterClass
	public void afterTest() {
		System.out.println("after test");
	}

}
