package hr.fer.oop.zad3;

public class PaintingPrinter extends MyList<Painting> implements Printable {

	public String print() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size(); i++) {
			sb.append(elementAt(i));
			sb.append("\n");
		}
		return sb.toString();
	}
}
