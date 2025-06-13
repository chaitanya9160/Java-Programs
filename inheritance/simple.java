import java.io.*;
import java.util.*;
class mydetail
{
	public static void my()
	{
		String a,b;
		System.out.println("Enter ur name"+"Enter ur address");
		Scanner sc=new Scanner (System.in);
		a=sc.nextLine();
			
		b=sc.nextLine();
		System.out.println(a+" "+b);
	}
}
class clgdetail extends mydetail
{
	public static void clg()
	{
		String c,d;
		System.out.println("Enter ur clg name");
		Scanner sc=new Scanner (System.in);
		c=sc.nextLine();
		System.out.println("Enter ur clg address");		
		d=sc.nextLine();
		System.out.println(c+" "+d);
	}
}
class mainclass
{
	public static void main(String arg[])
	{
		
		clgdetail obj=new clgdetail();
		obj.my();
		obj.clg();
	}
}