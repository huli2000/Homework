package ex03;

public class Tar6 {

	public static void main(String[] args) {
	int r = (int) ((Math.random() * 2)+49);
	System.out.println(r);
	
	if (r<50) {
		System.out.println("small");
		
	}else if (r>50) {
		System.out.println("big");
	}else {
		
		System.out.println("bingo");
	}
	
	

	}	
}