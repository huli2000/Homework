package Lesson11;

import java.util.Arrays;

public class Demo8Array {
public static void main(String[] args) {
	
		//create an array of 3 length
	
		int[]arr = {2,4,5};
			
		//print
		
		System.out.println(Arrays.toString(arr));
		//create temporary array of lenght 5
		
		int[]arr2 = new int[9];
		
		//copy elements from arr to arr2
		
		System.arraycopy(arr, 0, arr2, 0,arr.length);
		
		// assign to arr reference  to new array object
		
		arr = arr2;
		arr2 = null; //cancel the temp reference
		
		//print to new array with the old data
		
		System.out.println(Arrays.toString(arr));
	
}
}
