import java.io.*;
class recursion1
{	
	static int a=1;
	public static void nmce()
	{	a++;
		if(a<=4)
		{	
			System.out.println("Hey");
			nmce();  
		}
	}
	public static void main(String arg[])
	{
		nmce();
	}
}