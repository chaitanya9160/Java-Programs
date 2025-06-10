import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int principal,year;
		double loan,rate;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal");
		principal=sc.nextInt();
		
		System.out.println("Enter rate");
		rate=sc.nextDouble();
		
		System.out.println("Enter year");
		year=sc.nextInt();
		
		double si=((principal*rate*(year))/100);
		System.out.println("Total Interst is"+si);
		
		loan=(principal+si)/(year*12);
		
		System.out.println("Your monthly installment is"+loan);
		
		
		
	}
}