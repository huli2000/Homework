package HomeWork;

public class Page6Second2 {
public static void main(String[] args) {
	int r = (int) (Math.random() * 101);
	System.out.println("The number is" + " " +r);
	
	if (r>50)
	{
		System.out.println("Big!!");
	
	}
	else 
	{
		
		System.out.println("Small!!");
	}
	
	if ((int)r%2==0) {
		
		System.out.println("Even");
	}
	
	else {
		
		System.out.println("Odd");
	}
	}

	
}
