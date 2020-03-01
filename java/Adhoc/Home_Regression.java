package Adhoc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Home_Regression {
	WebDriver driver;
	
	
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		driver = new ChromeDriver() ;
		driver.navigate().to("https://www.facebook.com");
  }

  @AfterClass
  public void afterClass() {
  }

}
