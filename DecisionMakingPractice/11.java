import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.println("leap");
				}
				else
				{
					System.out.println("not leap");
				}
			
			}
			else
			{
				System.out.println("leap year but not century leap year");
				
			}
		}
		else
		{
			System.out.println("not leap year");
		}
		
	}
}