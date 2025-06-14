import java.io.*;
class recursion3
{	
	public static void nmce(int a)
	{
		
		a++;
		if(a<=4)
		{	
			System.out.println("Hey");
			nmce(a);  
		}
	}
	public static void main(String arg[])
	{
		int a=1;
		nmce(a);
	}
}