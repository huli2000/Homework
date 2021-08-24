package ex03;

public class Tar9 {

	public static void main(String[] args) {
		
		int year =(int)(Math.random()*2023);
	System.out.println(year);
		
		if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
			System.out.println("LeapYear");
		} else {
				System.out.println("Not Leap Year");
		}
	}
}