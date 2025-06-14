import java.io.*;
import java.util.*;

class excep_1
{
	public static void main(String arg[])
	{
		int a=100,b=0;
		try
		{
			System.out.println("Hey...");
			System.out.println(a/b);
			System.out.println("hello");
		}
		catch(ArithmeticException ar)
		{
			System.out.println("Error found");
			System.out.println(ar);
		}
	}
}