package hr.fer.oop.zi19;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
	
	private Map<String, Integer> emap = new HashMap<>();
	
	public Map<String, Integer> getData(){
		return emap;
	}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		String filename = file.getFileName().toString();
		int ind = filename.lastIndexOf(".");
		if (ind != -1) {
			String extension = filename.substring(ind + 1).toUpperCase();
			emap.compute(extension, (ext, val) -> val == null ? 1 : val + 1);
		}
		Objects.requireNonNull(file);
		Objects.requireNonNull(attrs);
		return FileVisitResult.CONTINUE;
	}

}
