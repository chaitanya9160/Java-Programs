import java.io.*;
import java.util.*;
class eighteen
{
	public static void main(String arg[])
	{
		System.out.print("Enter the character :");
		Scanner obj=new Scanner(System.in);
		char n=obj.next().charAt(0);			
		if(n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' || n == 'A' || n == 'E' || n == 'I' || n == 'O' || n == 'U')
		{
			System.out.println("This is vowel");
		}
		else
		{
			System.out.println("this is constant");
		}
	}
}