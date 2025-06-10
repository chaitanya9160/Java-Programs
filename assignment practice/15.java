import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{ 
		int s1,s2,s3,s4,s5;
		double total,per;
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter marks of 5 subjects");
		 s1=sc.nextInt();
		 s2=sc.nextInt();
		 s3=sc.nextInt();
		 s4=sc.nextInt();
		 s5=sc.nextInt();
			
		total=s1+s2+s3+s4+s5;
		per=(total*100)/500;
		System.out.println("percentage is"+per);
		
		if(per>=90)
		{
		 System.out.println("A");
		}
		else if(per>=80)
		{
			System.out.println("B");
		}
		else if(per>=70)
		{
			System.out.println("C");
		}
		else if(per>=60)
		{
			System.out.println("D");
		}
		else if(per>=40)
		{
			System.out.println("E");
		}
		else
		{
		    System.out.println("Fail"); 
		}
		
		
		
		
	}
}	