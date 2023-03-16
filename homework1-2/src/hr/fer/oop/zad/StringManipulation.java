package hr.fer.oop.zad;

import java.util.Scanner;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String line;
		line = sc.nextLine();
		while (!line.equalsIgnoreCase("quit")) {
			String words[] = line.split("\\s+");
			if (words.length != 0) {
				int ind = (int) (Math.random() * words.length);
				sb.append(words[ind].toUpperCase() + " ");
			}
			line = sc.nextLine();
		}
		System.out.println(sb.toString());
		sc.close();
	}
}
