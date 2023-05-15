package hr.fer.oop.exam;

public class Zad3 {
	
	public static void main(String[] args) {
		System.out.println(calculateSpread("Connection",'t'));
	}
	
	public static int calculateSpread(String str, Character ch) {
		if(!str.contains(ch.toString())) return -1;
		int distance = 0;
		int max = 0;
		for(int i = 0; i <str.length(); i++) {
			if(str.charAt(i) != ch) {
				distance++;
				max = Math.max(distance, max);
			}
			else {
				String left = str.subSequence(i+1, str.length()-1).toString();
				if(max!=0 || (!left.contains(ch.toString())) && max == distance)max=(max+1)/2;
				distance = 0;
			}
		}
		return max;
	}
}
