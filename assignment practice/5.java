import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		double unit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter units");
		unit=sc.nextDouble();
		 
	    if(unit<=100)
		{
			double charge=unit*1.5;
			System.out.println(charge);
			
		}
		else if(unit<=300&& unit>=100)
		{
			double a=unit-100;
			double bill=(100*1.5)+(a*2);
			System.out.println(bill);
		}
		else if(unit>300)
		{
			double b=unit-300;
			double 	bill=(100*1.5)+(200*2)+(b*3);
			System.out.println(bill);
		}
		
	}
}