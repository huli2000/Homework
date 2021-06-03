package HomeWork;

public class Page5Targil {
	
	public static void main(String[] args) {
		int r = (int) (Math.random() * 11);
		System.out.println("First number is" + " " +r);
		
		int d = (int) (Math.random() * 11);
		System.out.println("Second number is" + " " +d);
		
		System.out.println("Overall" + " " + (r+d));
		System.out.println("Average" + " " + ((r+d))/2);
		System.out.println("First Number/10" + "=" + (r/10)) ;
		System.out.println("Second Number/10" + "=" + (d/10)) ;
		System.out.println("Area of a rectangle" + "=" + (r*d)) ;

	}

}
