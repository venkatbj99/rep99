package testngDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UsingAnnotations2 extends DriverFactory
{
  @Test
  public void getMain()
  {	   
	  driver.findElement(By.linkText("Gmail")).click();
  }
}
