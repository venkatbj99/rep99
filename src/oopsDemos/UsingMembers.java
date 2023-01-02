package oopsDemos;

class Sample
{
	public int i=10;
	public static int s=20;
	
	public int getSquare(int i)
	{
		return(i*i);
	}
	
	public static double getPI()
	{
		return(3.14);
	}
}
public class UsingMembers 
{
	public static void main(String[] args)
	{
		System.out.println("s=" + Sample.s);
		System.out.println("The 2PI value is : " + 2*Sample.getPI());
		
		Sample obj=new Sample();
		System.out.println("i=" + obj.i);
		System.out.println("The square of 5 is : " + obj.getSquare(5));

	}

}
