package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingSync2_ExplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("venkatbj@yahoo.com");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='login-passwd']")));
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abc");

	}

}
