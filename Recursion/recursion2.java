import java.io.*;
class recursion2
{	
	public static void nmce()
	{
		int a=1;
		a++;
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