package Arrays;

public class print_subarrays {
    public static void print_subarray(int arr[]) {
 
        int total_subarry=0;        
        for(int i=0;i<arr.length;i++){   //i for start
           
            for(int j=i;j<arr.length;j++){   //j for end
              
                for(int k=i;k<=j;k++){         //for print only
                    System.out.print(arr[k]+" ");
                }
                total_subarry++;
                System.out.println();
            }
            System.out.println();    
        }
        System.out.println("Total Subarrays="+total_subarry);
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        print_subarray(arr);
    }
    
}
