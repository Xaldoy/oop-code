package hr.fer.oop.zad3;

public class NameablePrinter<T extends Artwork & Nameable> extends MyList<T> implements Printable {

	public String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sb.append(elementAt(i));
			sb.append("\n");
		}
		return sb.toString();
	}
}
