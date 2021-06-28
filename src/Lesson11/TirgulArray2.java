package Lesson11;


public class TirgulArray2 {
	
	public static void main(String[] args) {
		int[][] GM = new int[20][5];

//		System.out.println(GM[2][3]);
		
		for (int i = 0; i < GM.length; i++) {
			System.out.print("student: " +i + ":\t");
			for (int j = 0; j < GM[i].length; j++) {
			
				GM[i][j]= (int) (Math.random()*101) ;
				System.out.print(GM[i][j]+ "\t");
			}
			System.out.println();
			
		}
		System.out.println(GM[2][3]);
		}
	}



