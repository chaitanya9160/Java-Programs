package Arrays;

public class array_pairs {
    
    public static void pairs(int num[]) {
        
        int total_pair=0;                          //Time complexcity=O(n^2) for nested loop
        for(int i=0;i<num.length;i++){                        

            int current=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + current +"," + num[j]+ ")");
                total_pair++;             //formula of total_pair =n(n-1)/2...n=no. of elements
             }                                //means in array ...(5(5-1))/2=10...10 no.of pairs
             System.out.println();
         }
         System.out.println("Total Pairs="+ total_pair);
    }

    public static void main(String[] args) {
        
        int num[]={2,4,6,8,10};
        pairs(num);
    }
    
}
