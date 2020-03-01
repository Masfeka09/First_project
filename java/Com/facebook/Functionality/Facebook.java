package Com.facebook.Functionality;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Facebook {
	
	WebDriver driver;
	
	
	
  @Test
  public void f() {
	//WebElement field = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input)[1]"));
	
	/*WebElement firstname = driver.findElement(By.xpath("//*[@aria-label=\"First name\"]"));
	firstname.sendKeys("Masfeka");  
	  
	WebElement field = driver.findElement(By.xpath("//*[@aria-label=\"Last name\"]"));
	field.sendKeys("Kamal");*/
	 
	WebElement birth =driver.findElement(By.name("birthday_month"));
	Select dropofdown=new Select(birth);
	dropofdown.selectByVisibleText("Jul");
	
	WebElement date = driver.findElement(By.name("birthday_day"));
	Select dropofdown_date = new Select(date);
	dropofdown_date.selectByVisibleText("3");
	
	WebElement year = driver.findElement(By.name("birthday_year"));
	Select dropofdown_year = new Select(year);
	dropofdown_year.selectByVisibleText("1987");
	
	
	
	
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
