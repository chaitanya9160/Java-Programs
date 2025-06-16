package Arrays;

public class maxSubarraySum {
    public static void subarraySum(int arr[]) {
 
        int current_sum=0;                           //time complexity=O(n^2)...it is not good
        int max_sum=Integer.MIN_VALUE;        
        for(int i=0;i<arr.length;i++){   //i for start
           
            for(int j=i;j<arr.length;j++){   //j for end

                current_sum=0;        //value is changed so we can double initilize
              
                for(int k=i;k<=j;k++){ 
                    current_sum+=arr[k] ;       
                    
                }
                System.out.println(current_sum);
                if(max_sum<current_sum){
                    max_sum=current_sum;
                }
            }
                
        }
        System.out.println("Max Sum="+max_sum);
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarraySum(arr);
    }
    
    
}
