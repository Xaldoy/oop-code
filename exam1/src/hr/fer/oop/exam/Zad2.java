package hr.fer.oop.exam;

public class Zad2 {
	
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++ ) {
			System.out.println(myRandom(-1,10));	
		}
	}
	
	static int myRandom(int from, int to) {
		return (int)(Math.random()*(to-from+1)) + from;
	}
}
