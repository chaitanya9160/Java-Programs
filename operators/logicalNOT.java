import java.io.*;
class NOT
{
public static void main(String args[])
{
int a=10,b=5,c=20;
System.out.println(!(100==b) || b==a);
System.out.println(!(a<=b && c>=b));
System.out.println(a>=b || !(a==c));
}
}