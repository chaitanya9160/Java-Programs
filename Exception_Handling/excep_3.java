import java.io.*;
import java.util.*;

class excep_3
{
	public static void main(String arg[])
	{
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();

		try
		{
			System.out.println(a/b);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Null pointer exception");
		}
		catch(ArithmeticException ex1)
		{
			System.out.println(ex1.toString());
			System.out.println("Arithmetic Exception");
		}
		finally
		{
			System.out.println("always execute");
		}
	}
}	
