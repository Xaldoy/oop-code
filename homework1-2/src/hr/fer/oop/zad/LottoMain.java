package hr.fer.oop.zad;

import java.util.Scanner;
import hr.fer.oop.lotto.GenerateLottoArray;

public class LottoMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int num = sc.nextInt();
		while (num > 1 && num < max && max > 0) {
			int numbers[] = new int[num];
			numbers = GenerateLottoArray.getnNumbers(max, num);
			for(int number:numbers) {
				System.out.printf("%d ", number);
			}
			System.out.println();
			max = sc.nextInt();
			num = sc.nextInt();
		}
		sc.close();
	}
}
