package Lesson11;

import java.util.Arrays;

public class Demo9Array {
public static void main(String[] args) {
	
		
	
					int[]ar1 = {2,0,1,8,5,6,7,7,6,6,1,1,3,1,1,1,1,1,1,1,1};
					//int[]ar1 = new int [10];
					//ar1[]=(Math.random()*11);
					
					for (int i = 0 ; i < ar1.length ; i++) {
					
					
					boolean exists = false;
						
//					System.out.print("Index #" + i +" : " );
//					System.out.println(ar1[i]);
	
					for (int y = i+1; y<ar1.length; y++) {
						
						if (ar1[i]==ar1[y])
						{
							exists = true;
							break;
						}
						
					}
					if (exists == false) {
						
						System.out.println(ar1[i]);
					}
		}
}
}
