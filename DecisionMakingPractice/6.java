import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		char z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character");
		z=sc.next().charAt(0);
		
		if(z=='A'||z=='a'||z=='E'||z=='e'||z=='I'||z=='i'||z=='O'||z=='o'||z=='U'||z=='u')
		{
			System.out.println("it is vowel");
		}
		else
		{
			System.out.println("it is constant");
		}
		
	}
}
