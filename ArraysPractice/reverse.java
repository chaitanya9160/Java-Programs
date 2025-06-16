package Arrays;

public class reverse {

    public static void reverse_array(int arr[]) {
        
        int first=0,last=arr.length-1;

        while(first<last)
        {
           //swap...swapping used for reduce space complexcity only using 3 var-first,last,temp
            int temp=arr[last];            //space complexcity=O(1) & time= O(n)
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        
        reverse_array(arr);

        //print
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
