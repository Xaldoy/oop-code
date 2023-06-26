package hr.fer.oop;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;

public class VisitorMain {
	public static void main(String[] args) {
		String dirName = "D:\\Matej\\Škola";
		FileVisitor<Path> visitor = new MyFileVisitor(); 
		Path path= Path.of(dirName); 
		try { Files.walkFileTree(path, visitor); }
		catch (IOException e) { e.printStackTrace(); }
	}
}
