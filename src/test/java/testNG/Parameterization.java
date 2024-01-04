package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {

//By XML	

	WebDriver driver;

	@BeforeClass
	@Parameters({ "browser", "url" })
	public void setup(String browser, String app) {

		  if(browser.equalsIgnoreCase("firefox")) {
				 
			//Initializing the firefox driver (Gecko)
				  driver = new FirefoxDriver();	  

			  }else if (browser.equalsIgnoreCase("edge")) { 

				  //Initialize the edge driver

				  driver = new EdgeDriver();
			  }
		driver.get(app);

	}

	@Test(priority = 1)
	public void logoTest() {

		WebElement logo = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[1]/img"));
		Assert.assertFalse(logo.isDisplayed(), "logo not displayed");
		// Assert.assertTrue(logo.isDisplayed(), "logo not displayed");
	}

	@Test(priority = 2)
	public void Title() {

		String actualtitle = driver.getTitle();
		String ExpectedTitle = "OrangeHRM";
		Assert.assertEquals(ExpectedTitle, actualtitle, "Title is not match");

	}

	@AfterClass
	void teardown() {

		driver.quit();

	}

}
