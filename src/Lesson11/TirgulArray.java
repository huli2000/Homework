package Lesson11;


public class TirgulArray {
	
	public static void main(String[] args) {
		int[] test= new int[150];
		
				
		for (int i = 0; i < test.length; i++) {
			test[i] = (int)(Math.random()*101);
 			System.out.print(test[i] + ", ");
		}
	}
}

int[][] GM = new int[20][5];

System.out.println(GM[2][3]);
