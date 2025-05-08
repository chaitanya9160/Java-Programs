import java.io.*;
import java.util.*;

class area
{
	area(int a)
	{
		int s=a*a;
		System.out.println("Area of square"+s);
	}
	area(int l,int b)
	{
		int r=l*b;
		System.out.println("Area of rect"+r);
	}
}
class main
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of side");
		a=sc.nextInt();
		area obj=new area(a);
		
		System.out.println("Enter value of len & bredth");
		b=sc.nextInt();
		c=sc.nextInt();
        area obj2=new area(b,c);
	}
}