import java.io.*;
import java.util.*;
class second
{
	public static void main(String arg[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping"+a+" "+b);
	}
}