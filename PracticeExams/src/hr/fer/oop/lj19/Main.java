package hr.fer.oop.lj19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.OptionalDouble;

public class Main {
	public static void main(String[] args) {
		final String directory = "D:/_OOP";
		final String extension = "*"; // ili "pdf" ili "ppt" ili "java" ...
		Path root = Paths.get(directory);
		MetadataFileVisitor visitor = new MetadataFileVisitor(extension);
		try {
			Files.walkFileTree(root, visitor);
		} catch (IOException e) {
			e.printStackTrace();
		}

		double avg = visitor.getMetaData().stream()
				.map(a -> a.split(",")).filter(a -> !a[2].equals("0")).mapToDouble(a -> Double.valueOf(a[2])).average()
				.getAsDouble();
		
		System.out.println(avg);
	}
}
