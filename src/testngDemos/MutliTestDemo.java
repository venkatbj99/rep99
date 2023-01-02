package testngDemos;

import org.testng.annotations.Test;

public class MutliTestDemo 
{
	@Test
	public void Login()
	{
		System.out.println("Login Test script...");
	}
	@Test
	public void SignOut()
	{
		System.out.println("SignOut Test script...");
	}
	@Test
	public void Deposit()
	{
		System.out.println("Deposit Test script...");
	}
	@Test
	public void Withdraw()
	{
		System.out.println("Withdraw Test script...");
	}
}
