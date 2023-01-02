package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingFrames2_defaultContentDemo
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Venkat/frames/main.htm");
		
		driver.switchTo().frame("f1");
		driver.findElement(By.id("txtUid")).sendKeys("admin");
		driver.findElement(By.id("txtPwd")).sendKeys("abc");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("btnSignIn")).click();
		System.out.println("LoggedIn Successfully...");
	}

}
