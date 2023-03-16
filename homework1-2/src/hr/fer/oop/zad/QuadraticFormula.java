package hr.fer.oop.zad;


public class QuadraticFormula {
	
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Need 3 arguments for a,b,c in ax^2 + bx + c");
			System.exit(0);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int disc = b * b - 4 * a * c;

		if (disc < 0) {
			System.out.println("No solution in R");
			System.exit(0);
		}
		
		double s1 = (-b + Math.sqrt(disc))/(2*a);
		double s2 = (-b - Math.sqrt(disc))/(2*a);
		
		if(s1 != s2)
		System.out.printf("Solutions are: %.2f and %.2f %n",s1,s2);
		else System.out.printf("Solution is %.2f",s1);
		
	}
}
