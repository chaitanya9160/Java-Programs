import java.io.*;
import java.util.*;
import java.lang.*; // for exception package pn he nahi lhihal tri run hotat prg

class excep
{
	public static void main(String arg[])
	{
		int a=100;
		int b=0;
		try 
		{
			System.out.println(a/b);
		}
		catch(Exception ex)//Exception is class ex is obj and in obj stores error which is found
		{
			System.out.println("Error found");
			System.out.println(ex.toString()); //way to print error
			System.out.println(ex);  //way to print error
		}
	}	
}