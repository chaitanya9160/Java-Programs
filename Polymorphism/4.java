import java.io.*;
import java.util.*;

class nm
{
	private static void cse(String name,int roll_no)
	{
		System.out.println("Name is" + name);
		System.out.println("Roll no is"+ roll_no);
	}
	public static void dsy(String name,int roll_no) 
	{
		
		cse(name,roll_no);
		
	}
	
}
class nmce extends nm
{
	public static void main(String args[])
	{
		String a;
		int b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");
		a=sc.nextLine();
		System.out.println("Enter ur roll no");
		b=sc.nextInt();
		nmce obj=new nmce();
		obj.dsy(a,b);
		
	}
}	
		
		
		