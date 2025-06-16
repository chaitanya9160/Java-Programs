package Arrays;
import java.util.*;
public class array {
    public static void main(String arg[])
    {
        int num[]={1,2,3};  //user defined
        String fruits[]={"mango","banana","apple"};
      
        System.out.println(fruits[2]);
    
        int marks[]=new int[50];   //for user input

        Scanner sc=new Scanner(System.in);
        //int math;
        //math=sc.nextInt();
        System.out.println("Enter marks");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("marks of maths "+marks[0]);
        System.out.println("marks of eng "+marks[1]);
        System.out.println("marks of sci "+marks[2]);

        int per=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage= "+per);

        System.out.println("Array of length "+marks.length);
    }
    
}
