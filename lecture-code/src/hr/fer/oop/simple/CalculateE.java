package hr.fer.oop.simple;

public class CalculateE {

	public static void main(String[] args) {
		double sum = ePowerX(1);
		System.out.printf("e = %.6f%n", sum);
	}

	public static double ePowerX(double x) {
		double power = 1.0;
		double factorial = 1.0;
		double sum = 1.0;
		for (int i = 1; i < 10; i++) {
			power = power * x;
			factorial = factorial * i;
			sum += power / factorial;
		}
		return sum;
	}
}
