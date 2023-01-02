package pkg1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCalendar2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Month : ");
		String month=sc.next();
		month=month.substring(0,3);	//taking only first 3 chars from month
		System.out.print("Enter Day : ");
		String day=sc.next();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://redbus.in");

		//clicking on Date field
		driver.findElement(By.xpath("//*[@id='search']/div/div[3]/div/label")).click();

		//Month selection 

		//get the monthfield from the calendar
		//take first 3 chars from the month field text
		//compare is it not equal to first 3 chars of user given month
		//then click ">" button

		while(!driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[2]")).getText().substring(0,3).equals(month))
		{
			driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[1]/td[3]/button")).click();
		}

		//Day Selection
		List<WebElement> rows=driver.findElements(By.xpath(
				"//*[@id='rb-calendar_onward_cal']/table/tbody/tr"));

		for(int i=3;i<=rows.size();i++)
		{
			List<WebElement> cols=driver.findElements(By.xpath(
					"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td"));

			for(int j=1;j<=cols.size();j++)
			{
				WebElement cell=driver.findElement(By.xpath(
						"//*[@id='rb-calendar_onward_cal']/table/tbody/tr[" + i + "]/td[" + j + "]"));

				if(cell.getText().equals(day))
				{
					cell.click();
					break;
				}
			}

		}
	}

}
