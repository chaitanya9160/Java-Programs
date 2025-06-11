import java.io.*;
import java.util.*;

abstract class nmce   
{ 
	static int l,b;
	 abstract public int m1(int l,int b);
	{
	}
}
class nmpi extends nmce
{
	public int m1(int l,int b)
	{
		int area=l*b;
		return area;
	}
}
class abstraction
{
	public static void main(String arg[])
	{
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of Length & Breadth");
		l=sc.nextInt();
		b=sc.nextInt();
		nmce obj= new nmpi();
		int a=obj.m1(l,b);
		System.out.println("area is"+a);
	}
}	