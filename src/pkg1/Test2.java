package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void aSearch()
  {
	  WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		driver.manage().window().maximize();
		
		WebElement dd=driver.findElement(By.id("gh-cat"));
		Select s=new Select(dd);
		s.selectByVisibleText("Cameras & Photo");
		
		driver.findElement(By.id("gh-ac")).sendKeys("Sony");
		driver.findElement(By.id("gh-btn")).click();
		
		Reporter.log("Ebay product Search Test is Successful...",true);
		
  }
}
