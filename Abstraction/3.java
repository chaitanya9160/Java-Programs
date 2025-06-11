import java.io.*;
import java.util.*;

abstract class nmce   
{ 
	static int l,b;
	 public static int m1(int l,int b)
	{
		int area=l*b;
		return area;
	}
}
class nmpi extends nmce
{
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
		nmpi obj =new nmpi();
		int a=obj.m1(l,b);
		System.out.println("area is"+a);
	}
}	