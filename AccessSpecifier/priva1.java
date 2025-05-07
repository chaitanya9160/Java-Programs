import java.io.*;
import java.util.*;

class nmce
{
		private static void m1()
		{
			System.out.println("Heyy...!");
			
		}
		public static void m2()
		{
			m1();
		}
}
class priva1
{		
		public static void main(String args[])
		{
			nmce obj=new nmce();
			obj.m2();
		}
}
