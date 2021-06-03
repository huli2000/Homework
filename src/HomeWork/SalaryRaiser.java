package HomeWork;

public class SalaryRaiser {
public static void main(String[] args) {
	
	String name = "Moshe";
	int r = (int) (Math.random() * (6000-5000) + 5000);		
	//System.out.println("Dear xxx your salary is" + " " +r);
	
	int x = ((int)( r*1.1));
	//System.out.println(x);
	
	if (x<6000) {
		System.out.println("Dear "+ name + ", your salary was" + " " +r);
		System.out.println("After raising ,your new salary is " + x);
	}
	else
		System.out.println("Your salary remain " + r);
}
}
