package HomeWork;

public class Page6LastQuest {
	public static void main(String[] args) 
	{
		
		int r = (int) (Math.random() * 101);
		System.out.println(r);
		
		int x = (int) (Math.random() * 101);
		System.out.println(x);
		
		int y = (int) (Math.random() * 101);
		System.out.println(y);
		
		if (r>x && r>y) {
			
			System.out.println("The biggest number is " + r);
		}
		else if (x>r && y<x){
			System.out.println("The biggest number is " + x);
		}
		else {
			System.out.println("The biggest number is " + y);
		}

	}	
}
