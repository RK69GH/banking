package banking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase002_Addpayee {

	 WebDriver driver;
		@BeforeMethod
		  public void setup() {
			
		}	
		
		@Test
	  public void verifyLogin() {
			
			
	  }
	  

	  @AfterMethod
	  public void tearDown() {
		  driver.close();
	  }

	}


