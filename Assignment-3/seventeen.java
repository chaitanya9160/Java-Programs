import java.io.*;
import java.util.*;
class seventeen
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month Number(1-7) :");
		int num = sc.nextInt();			
		if(num==1)
			System.out.println("This is a Monday");
		else if(num==2)
			System.out.println("This is a Tuseday");
		else if(num==3)
			System.out.println("This is a Wednesday");
		else if(num==4)
			System.out.println("This is a Thursday");
		else if(num==5)
			System.out.println("This is Friday");
		else if(num==6)
			System.out.println("This is a Saturday");
		else if(num==7)
			System.out.println("This is a Sunday");
		else
			System.out.println("Enter 1 to 7...");
	}
}