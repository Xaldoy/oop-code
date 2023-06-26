package hr.fer.oop;

import java.io.File;

public class FilesCode {

	public static void main(String[] args) {
		
		File f1 = new File("D:/tmp/readme.txt");
		
		File f2 = new File("D:/tmp", "readme.txt");
		
		File dir = new File("d:/tmp");
		File file = new File(dir, "readme.txt");
		
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f2.getParentFile());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.length());
		System.out.println(file.isDirectory());
		
		
	}

}
