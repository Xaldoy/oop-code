package hr.fer.oop.simple;

public class StringMethods {
	public static void main(String[] args) {
		String text = "The quick brown fox jumps over lazy dogs.";
		String upperCase = text.toUpperCase();
		System.out.println("Upper case text: " + upperCase);
		System.out.println("Replacing fox with wolf: " + text.replace("fox", "wolf"));
		int position = text.indexOf("quick");
		System.out.println("quick starts at index: " + position);
		System.out.println(text.substring(position, position + 15));
		System.out.println("Original: " + text);

		String text2 = "The quick " + "brown ";
		text2 += "fox jumps over ";
		text2 += 3;
		text2 += " lazy dogs.";
		System.out.println(text2);
	}
}
