package Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Frist_Practice {
	
	WebDriver Driver;
	
		
  @Test
  public void f() throws InterruptedException {
	  
	Driver.switchTo().frame(0);
	
	Thread.sleep(8000);
	  
	Actions drag=new Actions(Driver);
	drag.dragAndDrop(Driver.findElement(By.id("draggable")), Driver.findElement(By.id("droppable"))).perform();
  }
  @BeforeClass
  public void beforeClass() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\masfe\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	Driver= new ChromeDriver();  
	Driver.navigate().to("https://jqueryui.com/droppable/");
	Driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
