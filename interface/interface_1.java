import java.io.*;
import java.util.*;

interface abc
{
	public  void m1();
	public  void m2();
	
}
class xyz implements abc
{
   public  void m1()
   {
	   int a=10,b=5,c;
	   c=a+b;
	   System.out.println(c);
   }
	public  void m2()
	{
	   int a=10,b=5,c;
	   c=a+b;
	   System.out.println(c);
	}
		
} 
class main
{
	public static void main(String arg[])
	{
		abc o=new xyz();
		o.m1();
		o.m2();
	}
}