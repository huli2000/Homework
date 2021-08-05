package Lesson17.input.output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Text2File {

	public static void main(String[] args) {

		File file = new File("c:/1/1.txt");
		try (FileWriter out = new FileWriter(file);) {
			out.write("hello from java App");
			System.out.println("data written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
