import java.io.*;
class ten
{
	public static void main(String arg[])
	{
		int arr[]={2,4,7,5,9};
		int small=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(small>=arr[i])
			{
				 small=arr[i];
			}
		}
		System.out.println(small);
	}

}

