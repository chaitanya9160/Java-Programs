import java.io.*;
import java.util.*;

class xyz
{
	public static void m1(int a)
	{
		int f=1;
		for(int i=1;i<=a;i++)
		{
		 f*=i;
		}
		System.out.println(f);
	}
		
	
	public static void main(String arg[])
	{
		int a=Integer.parseInt(arg[0]);
		xyz obj=new xyz();
		obj.m1(a);
	}
}