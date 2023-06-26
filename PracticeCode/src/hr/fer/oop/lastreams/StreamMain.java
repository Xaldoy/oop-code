package hr.fer.oop.lastreams;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import hr.fer.oop.MyFileVisitor;

public class StreamMain {
	public static void main(String[] args) throws IOException {
		List<Student> students = StudentData.load();
		String newlist = students.stream()
				.filter(a -> a.getPoints() > 30)
				.sorted(Student.BY_LAST_NAME)
				.map(a-> a.getFirstName())
				.collect(Collectors.joining(", "));
		System.out.println(newlist);
		//newlist.forEach(a -> System.out.println("1. " + a));
		
		double avgGrade = students.stream().filter(s -> s.getPoints() > 20).mapToInt(s -> s.getPoints()).average().getAsDouble();
		System.out.println(avgGrade);
		
		try(ZipFile zip = new ZipFile("D:/Simple.zip")){
			zip.stream().filter(a -> a.getName().toLowerCase().endsWith("txt")).forEach(a -> write3LinesWithScanner(zip, a));
		}
		
		
		String dirName = "D:/Matej";
		FileVisitor<Path> visitor = new MyFileVisitor();
		Path path = Paths.get(dirName);
		try {
			Files.walkFileTree(path, visitor);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void write3LinesWithScanner(ZipFile zip, ZipEntry entry){
		try (Scanner sc = new Scanner(zip.getInputStream(entry),"UTF-8")) {			
			System.out.format("---%s---%n", entry.getName());
			for(int i=0 ; i<3 && sc.hasNextLine() ; i++){
				String line = sc.nextLine();							
				System.out.println(line);
			}
			System.out.println();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}			
}
