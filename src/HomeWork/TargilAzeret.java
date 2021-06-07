package HomeWork;

public class TargilAzeret {
public static void main(String[] args) {
	int r = (int) (Math.random()* 6);
	
	int f =1;
	
	for (int k=2; k <=r; k++ ) {
		f = f * k;
		
	}
	System.out.println(r + "! = " + f);
}
}
