package random;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

public class Main {
	public static void main(String[] args) throws IOException {
		Path file = Path.of("D:/plasman.txt");
		BufferedReader br = new BufferedReader(new FileReader(file.toString()));
		String temp;
		while ((temp = br.readLine()) != null)
		System.out.println(temp);
		Path dir = Path.of("D:/tempdir");
		MyFileVisitor fv = new MyFileVisitor();
		Files.walkFileTree(dir, fv);
		BufferedWriter bw = new BufferedWriter(new FileWriter(file.toString()));
	}
}

class MyFileVisitor extends SimpleFileVisitor<Path> {

	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		PrintIfShould(file);
		Objects.requireNonNull(file);
		Objects.requireNonNull(attrs);
		return FileVisitResult.CONTINUE;
	}
	
	@Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
        throws IOException
    {
		PrintIfShould(dir);
        Objects.requireNonNull(dir);
        Objects.requireNonNull(attrs);
        return FileVisitResult.CONTINUE;
    }
	
	public void PrintIfShould(Path file) {
		Path dirpath = file.getParent();
		Path ignorefile = dirpath.resolve("Ignore.txt");
		if (!Files.exists(ignorefile)) System.out.println(file.getFileName());
	}

}