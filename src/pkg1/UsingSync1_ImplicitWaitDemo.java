package pkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSync1_ImplicitWaitDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("venkatbj@yahoo.com");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.xpath("//*[@id='login-passwd']")).sendKeys("abc");

	}

}
