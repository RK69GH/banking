package MercuryTours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class VerifyTicketPurchase {
	WebDriver driver;
	private WebElement passCount;
	
	@BeforeMethod
	  public void setup() {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void test() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  driver.findElement(By.cssSelector("input[value='oneway']")).click();
	  
	  WebElement passCount = driver.findElement(By.name("passCount"));
	  Select sel1 = new Select(passCount);
	  sel1.selectByIndex(1);
	  
	  WebElement fromPort = driver.findElement(By.name("fromPort"));
	  Select sel2 = new Select(fromPort);
	  sel2.selectByValue("London");
	
	  WebElement fromMonth = driver.findElement(By.name("fromMonth"));
	  Select sel3 = new Select(fromMonth);
	  sel3.selectByVisibleText("August");
	  
	  WebElement fromDay = driver.findElement(By.name("fromDay"));
	  Select sel4 = new Select(fromDay);
	  sel4.selectByValue("12");
	  
	  WebElement toPort = driver.findElement(By.name("toPort"));
	  Select sel5 = new Select(toPort);
	  sel5.selectByVisibleText("Paris");
  
	  WebElement toMonth = driver.findElement(By.name("toMonth"));
	  Select sel6 = new Select(toMonth);
	  sel6.selectByVisibleText("September");
	  
	  WebElement toDay = driver.findElement(By.name("toDay"));
	  Select sel7 = new Select(toDay);
	  sel7.selectByValue("21");
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.name("servClass")).click();
	  
	  WebElement airline = driver.findElement(By.name("airline"));
	  Select sel9 = new Select(airline);
	  sel9.selectByVisibleText("Pangea Airlines");
	  
	  driver.findElement(By.name("findFlights")).click();
  }
	  
      @AfterMethod
      public void afterMethod() {
		driver.quit();
  }
  
}

