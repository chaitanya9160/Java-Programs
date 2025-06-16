package Arrays;

public class liner_search {
                                                       //time complexcity=O(n)
    public static int search(int nums[],int key) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==key)
            {
                return i;   
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10,14,17,19,20};

        int key=14;
        int index=search(nums,key);

        if(index== -1)
        {
            System.out.println("NOT FOUND");
        }
        else{
             
            System.out.println("Key is at Index "+index);
        }
    }
}
