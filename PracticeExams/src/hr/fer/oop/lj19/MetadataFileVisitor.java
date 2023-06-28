package hr.fer.oop.lj19;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MetadataFileVisitor extends SimpleFileVisitor<Path> {
	private List<String> data = new LinkedList<>();

	public List<String> getMetaData() {
		printData(data);
		return data;
	} // dohvaćanje liste

	private String fileExtension;

	public MetadataFileVisitor(String fileExtension) {
		this.fileExtension = fileExtension;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		String filename = file.getFileName().toString();
		int index = filename.lastIndexOf(".");
		if(fileExtension == "*") data.add(dataBuilder(file,attrs));
		if (index != -1) {
			if (filename.substring(index, filename.length() - 1) == this.fileExtension) {
				data.add(dataBuilder(file, attrs));
			}
		}
		Objects.requireNonNull(file);
		Objects.requireNonNull(attrs);
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		data.add(dataBuilder(dir, attrs));
		Objects.requireNonNull(dir);
		Objects.requireNonNull(attrs);
		return FileVisitResult.CONTINUE;
	}

	public static String dataBuilder(Path path, BasicFileAttributes attrs) {
		StringBuilder sb = new StringBuilder();

		sb.append(path.getFileName().toString());
		sb.append(",");
		sb.append(attrs.creationTime().toString().substring(0, 9) + " ");
		sb.append(attrs.creationTime().toString().substring(11, 16));

		if (!attrs.isDirectory())
			sb.append("," + attrs.size());
		else sb.append(",0");
		return sb.toString();
	}

	public static void printData(List<String> data) {
		data.stream().forEach(a -> System.out.println(a));
	}
	
}
