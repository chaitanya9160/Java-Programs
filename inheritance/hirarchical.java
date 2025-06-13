import java.io.*;
import java.util.*;
class area1
{
	public static int arect(int a,int b)
	{
		int area=a*b;
		return(area);		
	}
}
class area2 extends area1
{
	public static int asqu(int a)
	{
		int area=a*a;
		return(area);
	}
}
class addi extends area1
{
	public static int add(int a,int b)
	{
		int add=a+b;
		return(add);
	}
}
class mainclass
{
	public static void main(String arg[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();

		area2 obj1=new area2();
		int p=obj1.arect(a,b);
		int q=obj1.asqu(a);

		addi obj2=new addi();
		int s=obj2.arect(a,b);
		int r=obj2.add(a,b);
			
		System.out.println(p);
		System.out.println(q);
		System.out.println(s);
		System.out.println(r);
   	}
}