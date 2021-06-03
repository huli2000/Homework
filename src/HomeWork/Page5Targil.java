package HomeWork;

public class Page5Targil {
	
	public static void main(String[] args) {
		int r = (int) (Math.random() * 101);
		System.out.println("First number is" + " " +r);
		
		int d = (int) (Math.random() * 101);
		System.out.println("Second number is" + " " +d);
		int sum = r + d ;
		double avg = sum / 2D;
		int rightDigr = r % 10;
		int rightDigd = d % 10;
		int area = r*d;
		
		// printouts
		
		System.out.println("sum = " + sum);
		System.out.println("average = " + avg);
		System.out.println("right digit of d: " + rightDigd);
		System.out.println("right digit of r: " + rightDigr);
		System.out.println("area is " + area);
		//System.out.println("Overall" + " " + (r+d));
		//System.out.println("Average" + " " + ((r+d))/2);
		//System.out.println("First Number/10" + "=" + (r/10)) ;
		//System.out.println("Second Number/10" + "=" + (d/10)) ;
		//System.out.println("Area of a rectangle" + "=" + (r*d)) ;

	}

}
