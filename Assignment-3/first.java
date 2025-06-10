import java.io.*;
import java.util.*;
class first
{
	public static void main(String arg[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping"+a+" "+b);
	}
}