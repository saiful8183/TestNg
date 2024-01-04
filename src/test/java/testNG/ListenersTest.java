package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



//@Listeners(testNG.Listeners2.class)


// Integretion possible alosBy XML 
public class ListenersTest {

	
	
	
	
WebDriver driver;
	
	@Test
	public void logoTest3() {
		
		  WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		  driver.manage().window().maximize(); driver.get(
		  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertFalse(logo.isDisplayed(), "logo displayed");
		// Assert.assertTrue(logo.isDisplayed(), "logo not displayed");
	}

	@Test
	public void Title4() {
		
		  WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		  driver.manage().window().maximize(); driver.get(
		  "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String actualtitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle, actualtitle, "Title is not match");

	}
	
	  @Test
	  public void testThree() {
		  
		  System.out.println("This is testThree");
		  throw new SkipException("This is skipped");
	  }

	@AfterMethod
	void teardown() {

		driver.quit();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
