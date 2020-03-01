package Com.facebook.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Practice3 {
	WebDriver driver;
	
	
	
	
  @Test
  public void f() {
	  WebElement forgotpasswd = driver.findElement(By.linkText("Forgot account"));
	  Actions window  = new Actions(driver);
	  window.keyDown(Keys.SHIFT).click(forgotpasswd).keyUp(Keys.SHIFT).build().perform();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");  
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
