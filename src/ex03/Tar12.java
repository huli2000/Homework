package ex03;

public class Tar12 {

	public static void main(String[] args) {
		
		int a =(int)(Math.random()*100);
		int b =(int)(Math.random()*100);
		
		System.out.println("a: " + a +" b: "+ b);
		
		if (a>b) {
			
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println("swagger");
			
			System.out.println("a: " + a +" b: "+ b);
		}
		
		for (int i = a; i <=b ; i+=5) {
			System.out.print(i + ", ");
		}
	}
}