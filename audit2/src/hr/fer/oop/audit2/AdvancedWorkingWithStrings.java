package hr.fer.oop.audit2;

public class AdvancedWorkingWithStrings {
	public static void main(String[] args) {
		String text = concateArguments(args);
		System.out.println(text);
		
		String[] elements = extractElements(text);
		for(String element:elements) {
			System.out.print(element);
			System.out.print(" ");
		}
		
	}

	private static String concateArguments(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			sb.append(args[i]);
			if (i != args.length - 1) {
				sb.append(';');
			}
		}

		return sb.toString();
	}

	public static String[] extractElements(String text) {
		String[] args = text.split(";");
		return args;
	}
}
