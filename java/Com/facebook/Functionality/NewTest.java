package Com.facebook.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	WebDriver Driver;
	
	
  @Test
  public void f() throws InterruptedException{
	  Driver.get("http://www.google.com");
	  Driver.navigate().to("http://www.facebook.com");
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  Driver = new ChromeDriver();
	  Driver.navigate().to("https://www.facebook.com");
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
