package Com.amazon.prime.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practice_session {
 
	WebDriver Driver;

	@Test
  public void f() throws InterruptedException {
	 //Driver.get("http://www.amazon.com");
	 Driver.navigate().to("http://www.amazon.com");
	 /*Driver.navigate().refresh();
	 Driver.manage().window().maximize();
	 Driver.navigate().back();
	 Driver.navigate().forward();*/
	
	WebElement field= Driver.findElement(By.id("twotabsearchtextbox"));
	field.sendKeys("Computer");
	
	WebElement prime = Driver.findElement(By.linkText("Try Prime"));
	Thread.sleep(6000);
	
	prime.click();
	Driver.findElement(By.partialLinkText("Try"));
	
	
	}
  
  
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is before class annotation");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  Driver = new ChromeDriver();
  
  }

  
  
  
  @AfterClass
  public void afterClass() {
	  //System.out.println("This is after class annotation");
  //Driver.quit();
  
  
  }
  
  

}
