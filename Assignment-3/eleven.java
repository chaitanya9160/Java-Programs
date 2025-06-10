import java.io.*;
import java.util.*;
class eleven
{
	public static void main(String arg[])
	{
		int rn,s1,s2,s3;
		String nm;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur roll no");
		rn=sc.nextInt();
		System.out.println("enter ur subject marks of eng,marathi,hindi");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		Scanner s=new Scanner(System.in);
		System.out.println("enter ur name");
		nm=s.nextLine();
		
		int total=s1+s2+s3;
		float avg=total*100/300;
		
		System.out.println("Roll no"+rn);
		System.out.println("name is"+nm);
		System.out.println("Marks of english"+s1);
		System.out.println("Marks of marathi"+s2);
		System.out.println("Marks of hindi"+s3);
		System.out.println("Total Marks"+total);
		System.out.println("Av"+avg);
		
		if(avg>80)
		{
			System.out.println("Division:First");
		}
		else if(avg>50)
		{
			System.out.println("Division:second");
		}
		else if(avg<50)
		{
			System.out.println("Division:Third");
		}
	}
}