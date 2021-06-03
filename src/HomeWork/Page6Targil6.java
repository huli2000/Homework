package HomeWork;

public class Page6Targil6 {
public static void main(String[] args) {
	int s = 57000;
	int t = 0;
	int ova = 0;
	
			System.out.println(t);
			
			if (s<=23000) {
				t = ((int)(s*0.1));
			//	System.out.println(t);
			
			}
			
			else if (s<=50000) {
				t = ((int)((s-23000)*0.2 +2300));
			//	System.out.println((int)((s-23000)*0.2 +2300));
			}
			else if (s<=100000) {
				t = ((int)((s-50000)*0.3 +7700));
			//	System.out.println((int)((s-50000)*0.3 +7700));
			}
		    else  {
		    	t = ((int)((s-100000)*0.4 +22700));
			//	System.out.println((int)((s-100000)*0.4 +22700));
			}
			ova = s - t;
		 	System.out.println("Your salary is " + s + " Taxes will be " + t + " Bank incoming "+ ova);	    	
}
}
