package HomeWork;

public class ClassTargilim {
public static void main(String[] args) {
	
	int r = (int) (Math.random()*10001);
	System.out.println(r);
	
	
	int digits = 1;
	int leftDig = 0;
	int sumOfDigits =0;
	int rev = 0;
	
	while(r > 9) {
		digits ++ ;
		sumOfDigits += r % 10;
		rev = rev*10 + r % 10;
		r = r / 10;	
	    
	}
	leftDig = r;
	sumOfDigits += r;
	rev=rev*10 +r;
	
	System.out.println("number of digits: " +digits);
	System.out.println("left digit: " + leftDig); 
	System.out.println("sum of digits: " + sumOfDigits);
	System.out.println("the reversed number: " + rev);


}
}
