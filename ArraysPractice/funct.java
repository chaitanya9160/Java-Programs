package Arrays;

public class funct {

    public static void update(int marks[],int non_change_val)
     {
        non_change_val=5;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
        
    }
   
    public static void main(String[] args) {
        int marks[]={96,97,98};
        int non_change_val=10;
        update(marks,non_change_val);

        System.out.println(non_change_val);    //array update zala pn value nahi 

        //print our marks
        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();

    }
    
}
