import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			if(b>c)
			{
				System.out.println("B is second largest no.");
			}
			else
			{
				System.out.println("C is second largest no.");
			}
		}
		if(b>a && b>c)
		{
			if(a>c)
			{
				System.out.println("A is second largest no.");
			}
			else
			{
				System.out.println("C is second largest no.");
			}
		}
		if(c>a && c>b)
		{
			if(a>b)
			{
				System.out.println("A is second largest no.");
			}
			else
			{
				System.out.println("B is second largest no.");
			}
		}
		
	}
} 