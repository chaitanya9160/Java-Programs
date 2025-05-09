import java.io.*;
class arith_1
{	
	static int a=10;
	static int b=5;
	public static void add()
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void sub()
	{
		int c=a-b;
		System.out.println(c);
	}
	public static void mul()
	{
		int c=a*b;
		System.out.println(c);
	}
	public static void div()
	{
		int c=a/b;
		System.out.println(c);
	}
}
class mainc
{
	public static void main(String arg[])
	{
		arith_1 obj=new arith_1();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}
}

		