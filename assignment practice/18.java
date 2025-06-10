import java.io.*;
import java.util.*;

class nmce
{
	public static void main(String arg[])
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		
		if(x>0&&y>0)
		{
			System.out.println("First quadrant");
		}
		if(x<0&&y>0)
		{
			System.out.println("Second quadrant");
		}
		if(x<0&&y<0)
		{
			System.out.println("Third quadrant");
		}
		if(x>0&&y<0)
		{
			System.out.println("Fourth quadrant");
		}
	}
}	
		