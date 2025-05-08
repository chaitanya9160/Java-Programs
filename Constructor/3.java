import java.io.*;
import java.util.*;

class nmce
{
	nmce(int a)
	{
		System.out.println("Hii");
	}
	public static void m1()
	{
		System.out.println("Hii2");
	}
}
class main
{
	public static void main(String arg[])
	{
		nmce obj=new nmce(100);
		obj.m1();
	}	
}