package ex03;

public class Tar5 {

	public static void main(String[] args) {
		
		int a =(int) (Math.random()*101);
		int b =(int) (Math.random()*101);
		System.out.println(a + ", "+ b);
		
//		if (a>b) {
//			System.out.println(a);
//		}else
//			
//			System.out.println(b);
//	}
	
	int max = a>b? a : b;
	System.out.println(max);
}
}