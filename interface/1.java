import java.io.*;
import java.util.*;

interface nmce
{
	public  void m1();
	
}
class nmpi implements nmce
{
	public void m1()
	{
		System.out.println("Hey...");
	}
}
class main
{
	public static void main(String args[])
	{
		nmce obj =new nmpi();
		obj.m1();
		
	}
}