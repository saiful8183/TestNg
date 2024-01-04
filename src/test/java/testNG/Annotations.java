package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	
	
	 @BeforeTest
	 public void beforeTest() { 
		 System.out.println("This will execute before Test");
		 }
	 
	@BeforeClass 
	public void beforeClass() { System.out.println("This will execute beforeClass"); }

	  @BeforeMethod public void beforeMethod() {
		  System.out.println("This will execute beforeMethod"); }
	
	  @Test
	  public void testOne() {
		  
		  System.out.println("This is testOne");
	  }
	  
	  @Test
	  public void testTwo() {
		  
		  System.out.println("This is testTwo");
		  
		  
	  }
	  
	  @AfterMethod 
	  public void afterMethod() { System.out.println("This Will execute  afterMethod");
	  }
		
	  
	  
	  @AfterClass 
	  public void afterClass() { System.out.println("This Will execute afterClass"); 
	  }
	  
	  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("This will execute after Test"); 
	  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  /*
		 * @BeforeMethod public void beforeMethod() {
		 * System.out.println("beforeMethod"); }
		 * 
		 * @AfterMethod public void afterMethod() { System.out.println("afterMethod"); }
		 * 
		 * @BeforeClass public void beforeClass() { System.out.println("beforeClass"); }
		 * 
		 * @AfterClass public void afterClass() { System.out.println("afterClass"); }
		 * 
		 * @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
		 * 
		 * @AfterTest public void afterTest() { System.out.println("afterTest"); }
		 * 
		 * @BeforeSuite public void beforeSuite() { System.out.println("beforeSuite"); }
		 * 
		 * @AfterSuite public void afterSuite() { System.out.println("afterSuite"); }
		 */
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

