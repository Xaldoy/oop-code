package hr.fer.oop.jir19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		final String directory = "D:/_OOP";
		Path root = Paths.get(directory);
		DuplicateFileVisitor visitor = new DuplicateFileVisitor();
		try {
			Files.walkFileTree(root, visitor);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		visitor.getDataRepo().values().stream().forEach(System.out::println);
		long counted = visitor.getDeletedData().values().stream().count();
		System.out.println(counted);
		long size = visitor.getDeletedData().values().stream().mapToLong(a -> a).sum();
		System.out.println(size);
	}
}
