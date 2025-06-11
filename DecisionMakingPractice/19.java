import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		double sal,tax,bonous=0;
		System.out.println("Enter your salary");
		Scanner sc=new Scanner(System.in);
		sal=sc.nextDouble();
		
		if(150000<=sal)
		{
			
			bonous=((sal*0.12)/100);
			System.out.println("Your Bonous is"+bonous);
		}
		else if(100000<=sal&&150000>=sal)
		{
	
			bonous=((sal*0.10)/100);
			System.out.println("Your Bonous is"+bonous);
		}
		else if(50000<=sal && 100000>=sal)
		{
			
			bonous=((sal*0.08)/100);
			System.out.println("Your Bonous is"+bonous);
		}
		else if(50000>=sal)
		{
			bonous=((sal*0.05)/100);
			System.out.println("Your Bonous is"+bonous);
		}
		
		double HRA = (sal * 40)/100;
		System.out.println("Home rent allouns"+HRA);
		
		tax = (sal * 12) / 100;
		System.out.println("Tax is"+tax);
		 
		double Total_sal=(sal+bonous+5000+2000+HRA)-tax;
		System.out.println("Total salary is"+Total_sal);
		
		
	}
}	
		
		
		
		
		