package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestAnnotations {

	
	@BeforeSuite
	public void beforeSuite() { 
		System.out.println("This will execute beforeSuite"); 
		}
	
  @BeforeClass 
	public void beforeClass() { System.out.println("This will execute beforeClass"); }

	  @BeforeMethod public void beforeMethod() {
		  System.out.println("This will execute beforeMethod"); }
	
	  @Test
	  public void testThree() {
		  
		  System.out.println("This is testThree");
	  }
	  
	  @Test
	  public void testFour() {
		  
		  System.out.println("This is testFour");
		  
		  
	  }
	  
	  @AfterMethod 
	  public void afterMethod() { System.out.println("This Will execute  afterMethod");
	  }
		
	  
	  
	  @AfterClass 
	  public void afterClass() { System.out.println("This Will execute afterClass"); 
	  }
	  
	  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("This will execute afterSuite");
		  }
	  
	  
	  
}
