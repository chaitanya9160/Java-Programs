package forloop;

public class Pyramid1 {
	public static void main(String arg[])
	{
		 for(int i=1;i<=9;i++)
		    {
		        for(int j=1;j<=9;j++)
		        {
		            if((j>=6-i && j<=4+i && i<=5)||(j>=i-4 && j<=14-i && i>5))
		            {
		            	System.out.print("*");
		            }
		            else
		            {
		            	System.out.print(" ");
		                
		            }

		        }
		        System.out.println();
		    }
	}
}
