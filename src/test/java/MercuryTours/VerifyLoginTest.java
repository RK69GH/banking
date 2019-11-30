package MercuryTours;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLoginTest {
	
	 WebDriver driver;
		@BeforeMethod
		  public void setup() {
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  }
		
		@Test
	  public void verifyLogin() {
			
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			String ExpectedTitle ="Find a Flight: Mercury Tours:";
			String ActualTitle = driver.getTitle();
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			
	  }
	  
	  @AfterMethod
	  public void tearDown() {
		  driver.close();
	  }

	}



