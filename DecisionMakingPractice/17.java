import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int a1,b1,c1;
		Scanner sc=new Scanner(System.in);
		a1=sc.nextInt();
		b1=sc.nextInt();
		c1=sc.nextInt();
		int a=a1*a1;
		int b=b1*b1;
		int c=c1*c1;
		
		if(a>b && a>c)  //if((a==b+c)||(b==a+c)||(c==a+b) then print....
		{
			if(a==b+c)
			{
				System.out.println("It is pythagoream triplet ");
			}
			else
			{
				System.out.println("It is not pythagoream triplet ");
            }
		}	
		if(b>a && b>c)
		{
			if(b==a+c)
			{
				System.out.println("It is pythagoream triplet ");
			}
			else
			{
				System.out.println("It is not pythagoream triplet ");
            }
		}	
		if(c>a && c>b)
		{
			if(c==a+b)
			{
				System.out.println("It is pythagoream triplet ");
			}
			else
			{
				System.out.println("It is not pythagoream triplet ");
            }
		}		
	}
}