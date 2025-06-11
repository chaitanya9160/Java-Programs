import java.io.*;
import java.util.*;

abstract class nmce   //abstract class cha obj create karta yet nahi so inherit use kel..
{
	public static void m1()
	{
		System.out.println("Hii...!");
	}
}
class nmpi extends nmce
{
	
}
class abstraction
{
	public static void main(String arg[])
	{
		nmpi obj =new nmpi();
		obj.m1();
	}
}	