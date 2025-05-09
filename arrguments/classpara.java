import java.io.*;
import java.util.*;

class mainclass
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		calculater cal=new calculater();
		cal.add(a,b);
		cal.sub(a,b);
		cal.mul(a,b);
		cal.div(a,b);
	}
}
class calculater
{		
	public static void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public static void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void mul(int a,int b)
	{ 
		int c=a*b;
		System.out.println(c);
	}
	public static void div(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
	}
}
	
	