import java.io.*;
import java.util.*;

class nmce
{
	
	private static void m1(int a)
	{
		//int a;
		int c=a+10;
		System.out.println(c);
	}
	public static void m2(int b)
	{
		m1(b);
		int d=b+20;
		System.out.println(d);
		
	}
}
class priva3
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