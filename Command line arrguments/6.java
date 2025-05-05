import java.io.*;
import java.util.*;

class area
{
	public static void m1(int a,int b)
	{
		int s=a*a;
		System.out.println("area of square"+s);
		
		int r=a+b;
		System.out.println("area of rect"+r);
		
		double c=3.14*a*a;
		System.out.println("area of circle"+c);
		
	}
}
class main
{
	public static void main(String arg[])
	{
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		
		
		area o=new area();
		o.m1(a,b);
		
	}
}