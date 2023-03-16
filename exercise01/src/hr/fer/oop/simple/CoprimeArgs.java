package hr.fer.oop.simple;
import hr.fer.oop.util.GCD;

public class CoprimeArgs {
	public static void main(String[] args) {
		int result = GCD.GetGCD(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		System.out.printf("gcd(%s, %s) = %d",args[0],args[1],result);
		if(result == 1) {
			System.out.println(" coprime!");
		}
	}
}
