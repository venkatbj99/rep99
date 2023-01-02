package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 
{
  @Test
  public void aSearch() 
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Reporter.log("Amazon product Search Test is Successful...",true);
		
  }
}
