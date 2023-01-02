package testngDemos;

import org.testng.annotations.Test;

public class GroupTestDemo 
{
	@Test(groups = {"Login"})
	public void Login()
	{
		System.out.println("Login Test script...");
	}
	@Test(groups = {"Login"})
	public void SignOut()
	{
		System.out.println("SignOut Test script...");
	}
	@Test(groups = {"Trans"})
	public void Deposit()
	{
		System.out.println("Deposit Test script...");
	}
	@Test(groups = {"Trans"})
	public void Withdraw()
	{
		System.out.println("Withdraw Test script...");
	}
}
