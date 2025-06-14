import java.io.*;
import java.util.*;
class nmce 
{
	public static void cse(int a)
	{
		System.out.println("Hey...!");
	}
}
class nmce1 extends nmce
{
	public static void cse(int b)
	{
			System.out.println("Hey...!!");
	}
}
class runtime 
{
	public static void main(String args[])
	{
		nmce1 obj=new nmce1();
		obj.cse(10);
		
		nmce obj1=new nmce();
		obj1.cse(100);
	}
}