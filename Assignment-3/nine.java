import java.io.*;
import java.util.*;
class nine
{
	public static void main(String arg[])
	{
		int a,b,c;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			System.out.println("a is large");
		}
		else if(b>c)
		{
			System.out.println("b is large");
		}
		else if(c>a) 
		{
			System.out.println("c is large");
		}
	}
}