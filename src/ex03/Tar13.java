package ex03;

public class Tar13 {

			public static void main(String[] args) {

			int r = (int) (Math.random() * 10_1); // 0 - 10,0
			int copy = r;
			System.out.println(r);
//			System.out.println(copy);

			int hafuch = 0;

			while (r != 0) {
				hafuch = hafuch * 10;
				hafuch += r % 10;
				r = r / 10;
			}

			System.out.println("the reveresed number: " + hafuch);
			System.out.println(copy == hafuch ? "Palindrom" : "NOT Palindrom");

		}

	}


