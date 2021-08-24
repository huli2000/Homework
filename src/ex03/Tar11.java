package ex03;

public class Tar11 {

	public static void main(String[] args) {
		
		int a =(int)(Math.random()*100);
		int b =(int)(Math.random()*100);
		
		System.out.println("a: " + a +" b: "+ b);
		
		int mekadem = a < b ? 1: -1;
		for (int i = a; i != b ; i+=mekadem) {
			
			System.out.print(i + ", ");
		}
	
		System.out.println(b);
	}
}