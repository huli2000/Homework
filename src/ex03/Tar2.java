package ex03;

public class Tar2 {

	public static void main(String[] args) {
		
		int a =(int) (Math.random()*101);
		int b =(int) (Math.random()*101);
		
		System.out.println("A is: "+ a + " B is: " + b);
		int sum = a+b;
		int RDA = a % 10;
		int RDB = b % 10;
		
		System.out.println("The overall: " +sum);
		System.out.println("Right digit of A:" + RDA);
			
	}
}
