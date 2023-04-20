package array;

public class LAB_Q4 {
	
	    public static void main(String[] args) {
	    	
	    	//int[] arr = {2, 3, 4, 5, 2, 4, 5, 7, 8};
	    	int[] arr = {5,2,7,7,5};
	    	
	    	System.out.println("The actual array is:");
	    	for(int i:arr)//for each loop for print 
	    	System.out.println(i);
	    	
	    	// Find duplicates in the array
	        for (int i=0; i<arr.length-1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("The Duplicate Array is: " + arr[i]);
	                }
	            }
	        }
	    }
	}
