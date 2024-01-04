package switchCase;



import java.time.Duration;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//import io.opentelemetry.api.internal.StringUtils;


public class SwitchCase {

	/*
	
	
	 WebDriver driver;
	 public String KeyLocator;
	
	 @BeforeTest 
	 public void launchApplication() {
	
		 
			 WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.firefox.driver", "/Users/saiful/Desktop/driver/geckodriver");
			driver = new FirefoxDriver();
	 //ChromeOptions co = new ChromeOptions();
	// co.addArguments("--remote-allow-origins=*");
	 //driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/"); 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	 }
	
	 @Test
	 public void performFacebookSteps()
	 {
	
	 String emailId = "XPATH#//input[@id='email']";
	 String password = "ID#pass";
	 String loginBtn = "NAME#login";
	 String forgotPassword = "LINKTEXT#Forgot password?"; 
	 String classMobile ="CLASSNAME#inputtext";
	
	
	 checkLocators(emailId);
	 checkLocators(password); 
	 checkLocators(loginBtn);
	 checkLocators(forgotPassword); 
	 checkLocators(classMobile);
	
	 }
	
	 public void checkLocators(String strLocator)
	
	 {

		 KeyLocator = StringUtils.substringBefore(strLocator, "#");
		// org.apache.commons.lang3.StringUtils.substringBefore(strLocator, "#");
	 System.out.println("Key------" + KeyLocator);
	
	 strLocator = StringUtils.substringAfter(strLocator, "#");
	
	 System.out.println("value------" + strLocator);
	
	 switch (KeyLocator) {
	
	 case "XPATH":
	
	 driver.findElement(By.xpath(strLocator)).sendKeys("saifislam8183@gmail.com");
	 System.out.println("expath is executed--->enter email id"); 
	 break;
	
	 case "ID":
	
	 driver.findElement(By.id(strLocator)).sendKeys("aswqtxt4346");
	 System.out.println("Id is executed----->enter password");
	
	 break;
	
	 case "NAME": 
		 driver.findElement(By.name(strLocator)).click();
	 System.out.println("Name is executed---->click login btn");
	
	 break;
	
	
	
	
	 case "LINKTEXT": 
		 driver.findElement(By.linkText(strLocator)).click();
	 System.out.println("LinkTest is executed--->forgate password clicked");
	
	 break;
	
	 
	 case "CLASSNAME":
			
		 driver.findElement(By.className(strLocator)).sendKeys("ManhaChowdhury");
		 System.out.println("Classname is executed--->enter mobile number");
		
		 break;
	// case "PARTIALLINKTEXT":
		// System.out.println("Test");
	
	// break;
	
	 
	 
	 
	 
	 default: 
		 System.out.println("Default statment");
		 break;
	
	 }
	 
		}
	 
	 @AfterTest
		public void teardown() {
			driver.close();
		}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 }

	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
	
	 WebDriver driver;
	
	
	
	public static WebDriver launchApplication(WebDriver driver, String browser, String url) {
		switch (browser.toLowerCase()) {
		case "chrome":
			// WebDriverManager.chromedriver().setup();
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			break;
		case "edge":
			// WebDriverManager.edgedriver().setup();
			System.setProperty("webdriver.edge.driver", "/Users/saiful/Desktop/driver/msedgedriver");
			driver = new EdgeDriver();
			break;
		case "firefox":
			// WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.firefox.driver", "/Users/saiful/Desktop/driver/geckodriver");
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("This browser do not support");
			break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		return driver;
	}
	@Test(groups = "sanity")
	public void TitleTest1() {
		// System.setProperty("webdriver.chrome.driver","/Users/saiful/Desktop/WebDrivers/chromedriver-mac-arm64");
		// ChromeOptions co=new ChromeOptions();
		// co.addArguments("--remote-allow-origins=*");
		// WebDriverManager.edgedriver().setup();
		// WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement logo = driver.findElement(By.className("login_logo"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test(groups = "sanity")
	public void logoTest2() {
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement logo = driver.findElement(By.className("login_logo"));
		Assert.assertTrue(logo.isDisplayed());
	}
	@Test(groups = "regression")
	public void Title3() {
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		System.out.println(driver.getTitle());
		String ExpectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, ExpectedTitle);
	}
	@Test(groups = "regression")
	public void logo4() {
		// WebDriverManager.firefoxdriver().setup();
		// WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement logo = driver.findElement(By.className("login_logo"));
		Assert.assertTrue(logo.isDisplayed());
	}
	public static void teardown(WebDriver driver) {
		driver.close();
		
		
	}
	}
	*/


	
	
	
	
	
	
	
	
	
	
	
	
	

