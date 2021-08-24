package ex03;

import java.util.Iterator;

public class Tar10 {

	public static void main(String[] args) {
		int top =(int)(Math.random()*1000);
		System.out.println("top: " +top);
		
		for (int i = 0; i < top; i+=2) {
			System.out.println(i+ ", ");
			
		}
	}

}
