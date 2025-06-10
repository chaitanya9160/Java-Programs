import java.io.*;
import java.util.*;
class six
{
	public static void main(String arg[])
	{
		int age;
		System.out.println("Enter ur age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("You are not eligible for voting");
		}
	}
}