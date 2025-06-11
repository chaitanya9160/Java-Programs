import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		char a;
		System.out.println("Enter any digit or character");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		if(a>='A'&& a<='Z')
		{
			System.out.println("it is Upercase");
		}
		else if(a>='a' && a<='z')
		{
			System.out.println("it is lowercase");
		}
		else if(a<='0' && a<='9')
		{
			System.out.println("it is digit");
		}
		else
		{
			System.out.println("Special Symbol");
		}
		
	}
	
}