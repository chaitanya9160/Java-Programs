import java.io.*;
import java.util.*;
class area1
{
	public static int area_rect(int l,int b)	
	{
		int area=l*b;
		return(area);
	}
}
class area2 extends area1
{
	public static int area_squar(int s)	
	{
		int area=s*s;
		return(area);
	}
}
class mainclass
{
	public static void main(String arg[])
	{
		int l,b,s;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		area2 obj=new area2();
		int rec=obj.area_rect(l,b);
		System.out.print(rec);	
		s=sc.nextInt();
		
		int sq=obj.area_squar(s);
		System.out.println(sq);


	}
}