package testngDemos;

import org.testng.annotations.Test;

public class PrioritizedTestDemo {
	@Test(priority = 1)
	public void Login()
	{
		System.out.println("Login Test script...");
	}
	@Test(priority = 4,enabled = false)
	public void SignOut()
	{
		System.out.println("SignOut Test script...");
	}
	@Test(priority = 2)
	public void Deposit()
	{
		System.out.println("Deposit Test script...");
	}
	@Test(priority = 3)
	public void Withdraw()
	{
		System.out.println("Withdraw Test script...");
	}
}
