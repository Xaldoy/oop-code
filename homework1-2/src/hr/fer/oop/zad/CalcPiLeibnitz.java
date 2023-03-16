package hr.fer.oop.zad;

public class CalcPiLeibnitz {
	public static void main(String[] args) {
		double pi;
		for (int i = 1; i <= 6; i++) {
			pi = 4 * calcOneFourhtPi((int) Math.pow(10, i));
			System.out.printf("%d: %.10f %n", (int)Math.pow(10, i), pi);
		}

	}

	public static double calcOneFourhtPi(int numOfSums) {
		double pifourth = 0;
		for (int i = 0; i <= numOfSums; i++) {
			if (i % 2 == 0)
				pifourth += 1. / (2 * i + 1);
			else
				pifourth -= 1. / (2 * i + 1);
		}
		return pifourth;
	}
}
