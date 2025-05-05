import java.io.*;
import java.util.*;

class simple
{
	public static void main(String arg[])
	{
		int principle=Integer.parseInt(arg[0]);
		float rate=Float.parseFloat(arg[1]);
		int year=Integer.parseInt(arg[2]);
		
		double si=(principle*rate*year)/100;
		
		System.out.println("Simple Interest is"+si);
		
	}
}
