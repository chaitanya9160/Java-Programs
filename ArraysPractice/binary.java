package Arrays;
public class binary {
    public static int binary_search(int num[],int key) {
        int start=0,end=num.length-1;

        while(start<=end)
        {                                           //time complexcity=O(logn)
            int mid=(start+end)/2;
         
            //comparision
            if(num[mid]==key){   //found
                return mid;
            }
            if(num[mid]<key){   //right
              start=mid+1;
            }
            else{              //left
                end=mid-1;
            }

        }
        return -1;   //for the invalid no. array starts from 0
    }
    public static void main(String[] args) {
        int num[]={1,4,2,6,3};
        int key=3;
        System.out.println("index of key is:"+binary_search(num, key));
    }
    
}
