package hr.fer.oop;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DirContent {
	public static void main(String[] args) throws IOException {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter directory:");
		 * String dirName = sc.nextLine(); Path directory = Path.of(dirName);
		 * DirectoryStream.Filter<Path> filter = new FilterByExtensions("txt", "pdf",
		 * "pptx"); try (DirectoryStream<Path> dirStream =
		 * Files.newDirectoryStream(directory, filter)) { for (Path path : dirStream) {
		 * System.out.printf("%s (%s bytes)%n", path.getFileName().toString(),
		 * Files.size(path)); } } sc.close();
		 */
		Scanner sc = new Scanner(System.in);
		String dirName = sc.nextLine();
		Path dir = Path.of(dirName).toAbsolutePath();
		directoryTree(dir,0);
		sc.close();
	}
	
	public static void directoryTree(Path directory, int level) throws IOException {
		try(DirectoryStream<Path> dirStream = Files.newDirectoryStream(directory)) {
			for(Path path: dirStream) {
				if(Files.isDirectory(path)) {
					System.out.println("(" + path.getFileName().toString().toUpperCase() + ")");
					directoryTree(path,0);
				}
				else {
					for(int i = 0; i < level; i++) {
						System.out.print("--");	
					}
					System.out.println(path.getFileName());
				}
			}
		}
	}
}
