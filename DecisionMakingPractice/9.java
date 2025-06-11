import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		char a=70;
		//System.out.println("Enter chara");
		//Scanner sc=new Scanner(System.in);
		//a=sc.next().charAt(0);
		if((a >='A' && a<='Z' )|| (a>='a'&& a<= 'z'))
		{
			System.out.println("it is an alphabet");
		}
		else
		{
			System.out.println("it is not an alphabet");
		}
	}
}	