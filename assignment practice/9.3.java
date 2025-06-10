import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		System.out.println("Enter any char");
		Scanner sc=new Scanner(System.in);   //convert char to integer
		char a=sc.next().charAt(0);
		int c=(int)a;
		System.out.println(c);
		
		
		System.out.println("Enter any number");   //convert int to char 
        int b=sc.nextInt();
		char d=(char)b;
		System.out.println(d);
	}
}	
		
		