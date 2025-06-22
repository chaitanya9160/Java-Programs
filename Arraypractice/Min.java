package practice;

public class Min {
	
	    public static void main(String[] args) {
	        int[] arr = {45, 22, 9, 65};
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) min = arr[i];
	        }
	        System.out.println("Min: " + min);
	    }
	


}
