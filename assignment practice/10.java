import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a;
		System.out.println("Enetr number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a%5==0&&a%11==0)
		{
			System.out.println("number is divisible by 5&11 ");
		}
		else
		{
			System.out.println("number is not divisible by 5&11");
		}
	}
}