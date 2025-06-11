import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of side AB");
		System.out.println("Enter value of side BC");
		System.out.println("Enter value of side CD");
		System.out.println("Enter value of side DA");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		if(a==b&&b==c&&c==d&&d==a)
		{
			System.out.println("It is square");
		}
		else if(a==c&&b==d)
		{
			System.out.println("It is Rectangle");
		}
		else
		{
			System.out.println("It is not Qudrilatral");
		}
			
	}
}