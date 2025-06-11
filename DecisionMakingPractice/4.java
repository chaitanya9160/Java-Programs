import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		double h,w,bmi;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter ur height");
		h=sc.nextInt();
		System.out.println("enter ur weight");
		w=sc.nextInt();
		
		bmi=(w/(h*h))*10000;
		System.out.println("Your BMI is"+bmi);
		
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>=18.5&& bmi<24.9)
		{
			System.out.println("normal weight");
		}
		else if(bmi>=25&&bmi<29.9)
		{
			System.out.println("over weight");
		}
		else if(bmi>29.9)
		{
			System.out.println("obesity");
		}
		
	}
}