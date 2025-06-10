import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int choice;
		System.out.println("Enter 1 for integer");
		System.out.println("Enter 2 for char");
		Scanner sc=new Scanner(System.in);
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			int a;
			a=sc.nextInt();
			if((a >='A' && a<='Z' )|| (a>='a'&& a<= 'z'))
			{
				System.out.println("it is an alphabet");
			}
			else
			{
				System.out.println("it is not an alphabet");
			}
			char d=(char)a;
			System.out.println(d);
			break;
			
			case 2:
			char b;
			b=sc.next().charAt(0);
			
			if((b >='A' && b<='Z' )|| (b>='a'&& b<= 'z'))
			{
				System.out.println("it is an alphabet");
			}
			else
			{
				System.out.println("it is not an alphabet");
			}
			int c=(int)b;
			System.out.println(c);
			break;
			
			default:
			
			System.out.println("Plz enter right choice");
		}
	}
}
