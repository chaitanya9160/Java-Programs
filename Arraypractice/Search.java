package practice;

public class Search {
	
	    public static void main(String[] args) {
	        int[] arr = {3, 8, 12, 5};
	        int search = 8;
	        boolean found = false;
	        for (int num : arr) {
	            if (num == search) {
	                found = true;
	                break;
	            }
	        }
	        System.out.println("Found: " + found);
	    }
	


}
