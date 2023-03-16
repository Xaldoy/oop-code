package hr.fer.oop.simple;

public class FindMin {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("No arguments received.");
			System.exit(1);
		}
		int min = Integer.MAX_VALUE;
		for(String arg:args) {
			if(Integer.parseInt(arg) < min) {
				min = Integer.parseInt(arg);
			}
		}
		System.out.printf("The smallest number is %d.",min);
	}
}
