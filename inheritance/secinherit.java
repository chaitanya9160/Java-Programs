import java.io.*;
import java.util.*;
class inherit
{
	public static void cat()
	{
		System.out.println("sub class");
	}
}
class secinherit1 extends inherit
{
	public static void dog()
	{
		System.out.println("main class");
	}
	public static void main(String args[])
	{
		secinherit1 obj=new secinherit1();
		obj.cat();
		obj.dog();
	}
}
