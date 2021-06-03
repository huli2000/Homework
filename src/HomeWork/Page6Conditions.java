package HomeWork;

public class Page6Conditions {
public static void main(String[] args) {
	
	int r = (int) (Math.random() * 11);
	System.out.println("First number is" + " " +r);
	
	int d = (int) (Math.random() * 11);
	System.out.println("Second number is" + " " +d); 
		if (r>d) {
			System.out.println("First Number Big");
		}
		
		else if (r==d) {
			System.out.println("Tie");		
		}
		
		else {
			System.out.println("Second Number Big");

		}
	
}
}
