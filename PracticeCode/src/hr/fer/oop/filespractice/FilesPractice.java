package hr.fer.oop.filespractice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitor;

public class FilesPractice {

	public static void main(String[] args) throws IOException {

		File file = new File("D:/readme.txt");
		file.createNewFile();
		String path = file.getAbsolutePath();
		try (FileWriter fw = new FileWriter(file)) {
            String content = "Hello, world!";  // Content to be written to the file
            fw.write(content);  // Write the content to the file
        } catch (IOException e) {
            e.printStackTrace();
        }
		System.out.println(file.getName());
		try (FileReader fr = new FileReader(file)) {
            int character;
            while ((character = fr.read()) != -1) {
                System.out.print((char) character);  // Print each character of the file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
