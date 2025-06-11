import java.io.*;
import java.util.*;

abstract class nmce   //abstract class cha obj create karta yet nahi so inherit use kel..
{
	abstract public void m1();  //when we want method abstraction that time class also declaire abstract 
	{                        //after abstract method ; is compulsury  we cant write block of code int abstract method 
		                      //ststic is non acsess modifier so remove that keyword
	}
}
class nmpi extends nmce
{
	 public void m1()
	{
		System.out.println("Hii...!");
	}
}
class abstraction
{
	public static void main(String arg[])
	{
		nmce obj =new nmpi();  //jya class madhe abstract method ahe tyacha obj ani jyachya madhe implement kely
		obj.m1();
	}
}	