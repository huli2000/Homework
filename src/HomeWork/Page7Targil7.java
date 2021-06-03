package HomeWork;

public class Page7Targil7 {
public static void main(String[] args) {

		//int y = 1400;
		
		int y = (int) (Math.random() * (2000-950) + 950);
		
		if (y % 4 == 0 && y % 100 != 0|| y %400 == 0 ) {
		
		System.out.println(y + " Leap year");
		
		}
		else {
			
		System.out.println(y + " Not a leap year");
		System.out.println("hello");
		}
}

}