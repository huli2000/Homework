package Lesson17.input.output;

import java.io.File;
import java.io.IOException;

public class a {

	public static void main(String[] args) {

		try {
			File directory = new File("c:\\1");
			File file = new File("c:/1/1.txt");

			System.out.println(directory.exists());
			System.out.println(file.exists());

			directory.mkdirs();
			file.createNewFile();

			System.out.println(directory.exists());
			System.out.println(file.exists());

			System.out.println("================");

			System.out.println(directory);
			System.out.println("is directory? " + directory.isDirectory());
			System.out.println("is file? " + directory.isFile());

			System.out.println(file);
			System.out.println("is directory? " + file.isDirectory());
			System.out.println("is file? " + file.isFile());
			
			file.delete();
			directory.delete();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
