package Lesson11;

import java.util.Iterator;

public class Demo3Array {
public static void main(String[] args) {
	 
	int [] arr = new int[100];
	 
	for (int i = 0; i < arr.length; i++) 
	{
	
	arr[i]=(int)(Math.random()*21);
	System.out.println(arr[i] + " , ");
	
    }
	
}
}
