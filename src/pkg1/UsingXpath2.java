package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[4]")).click();
	}

}
