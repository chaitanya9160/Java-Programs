import java.io.*;
import java.util.*;

class priva
{
		private static void m1()
		{
			System.out.println("Heyy...!");
			
		}
		public static void m2()
		{
			m1();
		}
		public static void main(String args[])
		{
			m1();
			m2();
		}
}
