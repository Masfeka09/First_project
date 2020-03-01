package Com.facebook.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practice2 {
	
	WebDriver Driver;
	
  @Test
  public void f() throws InterruptedException {
	 
	  WebElement cookies_type=Driver.findElement(By.xpath("//*[text()='ACCEPT']"));
	  Thread.sleep(6000);
	  cookies_type.click();
		
	
		
	WebElement Alert=Driver.findElement(By.xpath("//*[text()='Prompt Pop up']"));
	
	 Alert.click();
	 Thread.sleep(6000);
	  Driver.switchTo().alert().accept();
	  

  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");  
		Driver = new ChromeDriver() ;
		Driver.navigate().to("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		

	  
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
