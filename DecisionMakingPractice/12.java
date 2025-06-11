import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for celsius");
		System.out.printlns("Enter 2 for Fahrenheit");
		choice=sc.nextInt();
		if(choice==1)
		{
			double c,f;
			System.out.println("Enter Celsius");
			c=sc.nextDouble();
			f=(c*9/5)+32;
			System.out.println("Fahrenheit is"+f);
		}
		else if(choice==2)
		{
			double cel,fahr;
			System.out.println("Enter Fahrenheit");
			fahr=sc.nextDouble();
			cel=(fahr-32)*5/9;
			System.out.println("Celsius is"+cel);
		}
		else
		{
			System.out.println("Wrong choice");
		}
		
		
		
	}
}