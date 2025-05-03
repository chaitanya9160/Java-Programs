import java.io.*;
class AND
{
public static void main(String args[])
{
int a=100,b=50,c=20;
System.out.println(100==b && b==a);
System.out.println(a<=b && a>=b);
System.out.println(a>=c && c<=b && a>=c);
System.out.println(c<=a && c!=a && c!=b );
System.out.println(b!=c && a!=c);
System.out.println(a>=c && c!=a);
}
}
