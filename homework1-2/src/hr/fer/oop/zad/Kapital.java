package hr.fer.oop.zad;

public class Kapital {
	public static void main(String[] args) {
		double kapital = Integer.parseInt(args[0]);
		double kamata = Double.parseDouble(args[1]);
		int godine = Integer.parseInt(args[2]);
		System.out.println("---------------------------");
		System.out.println("| godina |     kapital    |");
		System.out.println("---------------------------");
		
		for(int i = 0; i <= godine; i++) {
			double nakon = kapital * Math.pow(1+kamata, i);
			System.out.printf("|  %3d   |  %10.2f    |%n", i,nakon);
		}
		System.out.println("---------------------------");
	}
}
