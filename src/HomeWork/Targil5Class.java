package HomeWork;

public class Targil5Class {


	public static void main(String[] args) {
		
		int r = (int) (Math.random()*10001);
		System.out.println(r);
	
		int rev = 0;
		int copy = r;
		
		while(r !=0) {
	
			rev = rev*10;
			rev += r %10;
			r = r / 10;	
		    
		}

			System.out.println("the reversed number: " + rev);
			System.out.println(copy == rev ? "palindrom" : "not palindrom");

	}
	}

