import java.io.*;

class excep_2
{
	public static void main(String arg[])
	{
	int var[]={11,22,33,44,55};
		try
		{
			
			System.out.println(var[0]);
			System.out.println(var[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
			
		}
		
	}
}