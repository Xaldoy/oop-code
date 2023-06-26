package hr.fer.oop.zi;

public class Common {
	public static <T> void printCollection(Iterable<T> col) {
		for(T element : col) {
			System.out.println(element);
		}
		System.out.println();
	}
}
