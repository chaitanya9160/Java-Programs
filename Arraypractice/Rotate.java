package practice;

public class Rotate {
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        int rotateBy = 2;
	        int n = arr.length;
	        int[] temp = new int[n];

	        for (int i = 0; i < n; i++) {
	            temp[i] = arr[(i + rotateBy) % n];
	        }

	        for (int num : temp) System.out.print(num + " ");
	    }

}
