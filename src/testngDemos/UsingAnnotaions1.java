package testngDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UsingAnnotaions1 extends DriverFactory
{
  @Test
  public void Search()
  {	  
	  driver.findElement(By.name("q")).sendKeys("Selnium Webdriver");
	  
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).perform();
  }
}
