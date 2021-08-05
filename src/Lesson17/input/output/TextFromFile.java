package Lesson17.input.output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextFromFile {

	public static void main(String[] args) throws IOException {

		File file = new File("c:/1/1.txt");
//		try (FileReader in = new FileReader(file)) {
		try (BufferedReader in = new BufferedReader(file) {
			
//			int c = in.read();
			String line = in.readLine();
//			while (c != -1) {
			while (line != null) {
//				System.out.print((char)c);
				System.out.println((line));
//				c = in.read();
				line = in.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		}
	}
}
