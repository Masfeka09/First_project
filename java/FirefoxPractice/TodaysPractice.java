package FirefoxPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class TodaysPractice {
	WebDriver driver;
	
  @Test
  public void f() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\masfe\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.navigate().to("https://www.firefox.com");
	
	driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
