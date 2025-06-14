import java.io.*;
import java.util.*;

class nm
{
	private static void cse(String name,int roll_no)
	{
		System.out.println("Name is" + name);
		System.out.println("Roll no is"+ roll_no);
	}
	public static void cs() 
	{
		String a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");
		a=sc.nextLine();
		System.out.println("Enter ur roll no");
		b=sc.nextInt();
		cse(a,b);
		
	}
	
}
class nmce extends nm
{
	public static void main(String args[])
	{
		nmce obj=new nmce();
		obj.cs();
		
	}
}	
		
		
		