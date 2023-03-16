package hr.fer.oop.lotto;
import java.util.Arrays;
import java.util.Random;

public class GenerateLottoArray {
	public static int[] getnNumbers(int max, int n) {
		int[] number = new int[n];
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			boolean exists;
			do {
			exists = false;
//			int tempnum = (int) (Math.random() * max) + 1;
			int tempnum = Math.abs(random.nextInt()%(max)+1);
			
			for(int num: number) {
				if(tempnum == num) exists = true;
			}
			if(!exists) {
				number[i]=tempnum;
			}
			} while (exists);
		}
		Arrays.sort(number);
		return number;
	}
}
