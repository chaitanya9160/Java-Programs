import java.io.*;
import java.util.*;

class nmce
{
	static int var;
	nmce(int a)
	{
		var=a;
	}
	public static void getter()
	{
		System.out.println("Hii..");
	}
}
class main
{
	public static void main(String arg[])
	{
		nmce obj=new nmce(100);
		obj.getter();
	}
}