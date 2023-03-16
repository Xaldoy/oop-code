package hr.fer.oop.zad;

import java.util.Scanner;

public class QuadraticFormulaInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int disc = b * b - 4 * a * c;

		if (disc < 0) {
			System.out.println("No solution in R");
			System.exit(0);
		}

		double s1 = (-b + Math.sqrt(disc)) / (2 * a);
		double s2 = (-b - Math.sqrt(disc)) / (2 * a);

		if (s1 != s2)
			System.out.printf("Solutions are: %.2f and %.2f %n", s1, s2);
		else
			System.out.printf("Solution is %.2f", s1);
		
		sc.close();

	}
}
