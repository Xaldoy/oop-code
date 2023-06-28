package hr.fer.oop.jir19;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DuplicateFileVisitor extends SimpleFileVisitor<Path> {

	private Map<String, Long> data = new HashMap<String, Long>();
	private Map<String, String> repo = new HashMap<String, String>();

	public Map<String, Long> getDeletedData() {
		return data;
	} // dohvaćanje pobrisanih

	public Map<String, String> getDataRepo() {
		return repo;
	} // dohvaćanje unikata

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		
		Objects.requireNonNull(file);
		Objects.requireNonNull(attrs);

		if (!repo.containsValue(file.getFileName().toString())) {
			repo.put(Digester(file), file.getFileName().toString());
			return FileVisitResult.CONTINUE;
		}

		if (repo.containsValue(file.getFileName().toString())) {
			data.put(file.toString(), attrs.size());
			deleteFile(file, data.get(Digester(file)));
		}

		return FileVisitResult.CONTINUE;
	}

	public void deleteFile(Path file, long size) {

	}

	public String Digester(Path file) {
		return file.toString();
	}
}
