package hr.fer.oop.zad;

public class CalcPiEuler {
	public static void main(String[] args) {
		numberOfSummations();
	}

	public static void numberOfSummations() {
		int pi5 = (int)(Math.PI * 1e5);
		int first5 = 0;
		double sum = 0;
		int i = 1;
		do {
			sum += 1./((double)i*i);
			i++;
			first5 = (int)(1e5 * Math.sqrt(sum*6));
		} while(first5!=pi5);
		System.out.printf("Pi after %d steps is %f%n", i, Math.sqrt(6. * sum));					
	}
}
