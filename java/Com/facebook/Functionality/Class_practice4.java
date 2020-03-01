package Com.facebook.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Class_practice4 {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		driver = new ChromeDriver() ;
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize(); 
	  
	  
  }

  @AfterClass
  public void afterClass() {
	screenshoots();  
  }
  
public void screenshoots() {
  File shots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(shots, new File());
}
  
}
