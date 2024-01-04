package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Grouping {

	
	//By XML
	
	

	@Test(groups={"sanity"})
	  public void testOne() {
		  
		  System.out.println("This is testOne");
	
	  }
	  
	@Test(groups={"sanity"})
	  public void testTwo() {
		  
		  System.out.println("This is testTwo");
		  
		  
	  }
	  
	
	@Test(groups={"regression"})
	  public void testThree() {
		  
		  System.out.println("This is testThree");
	  }
	  
	@Test(groups={"regression"})
	  public void testFour() {
		  
		  System.out.println("This is testFour");
		  
		  
	  }
	  
	@Test(groups={"sanity","regression"})
	  public void testFifth() {
		  
		  System.out.println("This is testFifth");
		  
		  
	  }
	
}
