package practice;

public class Max {
	
	    public static void main(String[] args) {
	        int[] arr = {12, 55, 8, 90};
	        int max = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) max = arr[i];
	        }
	        System.out.println("Max: " + max);
	    }
	


}
