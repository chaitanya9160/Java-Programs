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
class addi extends area2
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

		addi obj=new addi();

		int p=obj.arect(a,b);
		int q=obj.asqu(a);
		int r=obj.add(a,b);
			
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
   	}
}