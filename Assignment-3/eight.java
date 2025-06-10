import java.io.*;
import java.util.*;
class eight
{
	public static void main(String arg[])
	{
		int a,b;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is large");
		}
		else if(b>a)
		{
			System.out.println("b is large");
		}
	}
}