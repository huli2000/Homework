package Lesson11;

import java.util.Arrays;
import java.util.Iterator;

public class Demo5Array {
public static void main(String[] args) {
	
	int [][] gradeMatrix = new int [20][5]; {
		
		//gradeMatrix [0][0] = 100;
		

		for (int i = 0; i < gradeMatrix.length; i++) {
			System.out.print("Student #" + i + " ," );
			for (int j = 0; j < gradeMatrix[i].length; j++) {
				gradeMatrix[i][j] = (int)(Math.random()*101);
		System.out.print(gradeMatrix [i][j]+ "	\t" );
			}
			System.out.println();
		}
		
		
		
			}		
    }
	
}

