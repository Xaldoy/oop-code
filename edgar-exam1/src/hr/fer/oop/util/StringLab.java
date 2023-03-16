package hr.fer.oop.util;

public class StringLab {

	public static void main(String[] args) {
		String[] elements = { "aa EN", "Berlin", "Roubaix" };
		System.out.println(stringFloss(elements));
		System.out.println("NICE");
	}

	static String stringFloss(String[] elements) {
		int maxlen = 0;
		for (String element : elements) {
			maxlen = Integer.max(maxlen, element.length());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < maxlen; i++) {
			for (String element : elements) {
				if (i < element.length())
					sb.append(element.charAt(i));
			}
		}
		return sb.toString();
	}
}
