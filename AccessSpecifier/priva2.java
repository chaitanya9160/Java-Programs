import java.io.*;
import java.util.*;

class nmce
{
	static int a;
	private static void m1(int b)
	{
		a=b;
		int c=a+10;
		System.out.println(c);
	}
	public static void m2(int b)
	{
		m1(b);
		int d=a+20;
		System.out.println(d);
		
	}
}
class priva2
{
	public static void main(String agrs[])
	{
		int b;
		System.out.println("Enter no. ");
		Scanner sc=new Scanner(System.in);
		b=sc.nextInt();
		nmce obj= new nmce();
		obj.m2(b);
	}
}