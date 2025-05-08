import java.io.*;
import java.util.*;

class nmce
{
	nmce(int a)
	{
		int s=a*a;
		System.out.println("Area of square"+s);
	}
	nmce(int l,int b)
	{
		int r=l*b;
		System.out.println("Area of rect"+r);
	}
}
class main
{
	public static void main(String arg[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of side");
		x=sc.nextInt();
		nmce obj=new nmce(x);
		
		System.out.println("Enter value of len & bredth");
		y=sc.nextInt();
		z=sc.nextInt();
        nmce obj2=new nmce(y,z);
	}
}