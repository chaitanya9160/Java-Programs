import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		char a;
		System.out.println("Enter chara");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		
		if(a>=65&&a<=127)
		{
			a=(char)sc.nextInt();              //Explicit type conversion
			if((a >='A' && a<='Z' )|| (a>='a'&& a<= 'z'))
			{
				System.out.println("it is an alphabet");
			}
		}	
		else if((a >='A' && a<='Z' )|| (a>='a'&& a<= 'z'))
		{
			System.out.println("it is an alphabet");
		}
		else
		{
			System.out.println("it is not an alphabet");
		}
	}
}	