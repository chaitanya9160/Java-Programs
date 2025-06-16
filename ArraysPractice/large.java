package Arrays;
import java.util.*;

public class large {

    public static int get_large(int nums[])
    {
        int large=Integer.MIN_VALUE; //-infinity
        int small=Integer.MAX_VALUE; //+infinity

        for(int i=0;i<nums.length;i++)
        {
            if(large<nums[i])
            {
                large=nums[i];
            }
            if(small>nums[i])
            {
                small=nums[i];
            }
        }
        System.out.println("Smallest val is "+small);
        return large;
        
    }
    public static void main(String[] args) {
        int nums[]={2,6,4,8,1};
        System.out.println("largest val is "+ get_large(nums));
    }
    
}
