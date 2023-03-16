package hr.fer.oop.util;

public class GCD {
	public static int GetGCD(int num1, int num2) {
		int a;
		if(num1 < num2)a = num1;
		else a = num2;
		for(int i = a; i >= 1; i--) {
			if(num1%i==0 && num2%i==0) {
				return i;
			}
		}
		return 1;
	}
}
