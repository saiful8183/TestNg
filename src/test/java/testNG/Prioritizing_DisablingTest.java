package testNG;

import org.testng.annotations.Test;

public class Prioritizing_DisablingTest {

	
	
	 @Test(priority=1)
	  public void testOne() {
		  
		  System.out.println("This is testOne");
	  }
	  
	  @Test(priority=2)
	  public void testTwo() {
		  
		  System.out.println("This is testTwo");
		  
		  
	  }
	  
	
	  @Test(priority=3)
	  public void testThree() {
		  
		  System.out.println("This is testThree");
	  }
	  
	  @Test(priority=4,enabled=false)
	  public void testFour() {
		  
		  System.out.println("This is testFour");
		  
		  
	  }
	
	
	
	
}
