package Com.amazon.prime.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class dropdn {
	WebDriver driver;
	
	
  @Test
  public void f() {
	 Actions control = new Actions(driver);
			 
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver() ;
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
