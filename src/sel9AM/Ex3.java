package sel9AM;

import java.util.Scanner;

public class Ex3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String rep;

		do
		{
			System.out.print("Enter Number1 : ");
			int n1=sc.nextInt();
			System.out.print("Enter Number2 : ");
			int n2=sc.nextInt();
			System.out.print("Enter choice of operation(+/-/*) : ");
			String choice=sc.next();

			boolean isValid=true;
			int res=0;

			switch(choice)
			{
			case "+":
				res=n1+n2;
				break;

			case "-":
				res=n1-n2;
				break;

			case "*":
				res=n1*n2;
				break;

			default:
				isValid=false;
				break;				
			}

			if(isValid==true)
			{
				System.out.println("The arithmetic operation " + choice + " on " + n1 + " with " + n2 + " is : " + res);
			}
			else
			{
				System.out.println("Invalid operator entered...");
			}
			System.out.print("Do you want to continue(y/n) ? : ");
			rep=sc.next();
		}while(rep.equals("y") && !rep.equals("n"));
	}

}


















