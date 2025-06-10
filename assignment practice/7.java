import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a;
		System.out.println("Enter month number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a==9||a==10||a==11)
		{
			System.out.println("Winter");
		}
		if(a==12||a==1||a==2)
		{
			System.out.println("Spring");
		}
		if(a==3||a==4||a==5)
		{
			System.out.println("Summer");
		}
		if(a==6||a==7||a==8)
		{
			System.out.println("Autumn");
		}
		
	}
}