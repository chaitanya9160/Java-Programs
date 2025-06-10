import java.io.*;
import java.util.*;
class seven
{
	public static void main(String arg[])
	{
		int a;
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a>0)
		{
			System.out.println("1");
		}
		else if(a<0)
		{
			System.out.println("-1");
		}
		else if(a==0)
		{
			System.out.println("0");
		}
	}
}	
