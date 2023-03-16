package hr.fer.oop.constructors;

public class Point {

	private double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) {
		this(p.x, p.y);
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void print() {
		System.out.printf("(%.2f %.2f)%n", x, y);
	}

	public boolean isEqualTo(Point other) {
		return Math.abs(x - other.x) < 1E-8 && Math.abs(y - other.y) < 1E-8;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2,5);
		Point p2 = new Point(p1);
		System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
		p1.setX(1);
		p1.setY(2);
		System.out.println("p1.isEqualTo(p2) : " + p1.isEqualTo(p2));
		p1.print();
		p2.print();
	}
}