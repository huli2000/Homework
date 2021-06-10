package Lesson11;

public class Demo2Array {
public static void main(String[] args) {
	
	//static initialization 
	int [] numbers = {4,1,4,6,7,8,11};
	System.out.println(numbers[0]);
	System.out.println(numbers[1]);
	System.out.println(numbers[2]);
	
	//print an array
	for (int i = 0; i<numbers.length; i++)
	{
	System.out.print(numbers[i]+ ", ");
	}
}
}
