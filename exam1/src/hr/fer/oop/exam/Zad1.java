package hr.fer.oop.exam;

public class Zad1 {
	
	public static void main(String[] args) {
		Character a = firstNonRepeatingChar("Ovdje je slovo o prvo");
		System.out.println(a);
	}
	
	public static Character firstNonRepeatingChar(String str) {
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; i < str.length() + 1; j++) {
				if(j == str.length()) return str.charAt(i);
				if(i!=j && Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) break;
			}
		}
		return null;
	}
}
