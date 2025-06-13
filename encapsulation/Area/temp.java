import java.io.*;
import java.util.*;
class temperature
{
public static void main(String args[])
{
float F,C;
Scanner obj=new Scanner(System.in);
C=obj.nextInt();
F=(9*C/5)+32;
System.out.println("Fahrenheit is "+F);
}
}