package hr.fer.oop.constructors;

public class Vector {
	private Point p;

	public Vector(Point p) {
		this.p = p;
	}
	
	public Vector(double x, double y) {
		this(new Point(x,y));
	}
	
	public void print() {
		this.p.print();
	}
	
	public final static Vector e1 = new Vector(new Point(1,0));
	public final static Vector e2 = new Vector(new Point(0,1));
	public static Vector alpha1, alpha2;
	
	static {
		alpha1 = e1;
		alpha2 = e2;
	}
	
	public static void main(String[] args) {
		Vector v = new Vector(new Point(3,4));
		v.print();
		Vector.alpha1 = new Vector(1,1);
		Vector.alpha2 = new Vector(-1,2);
		v.print();
	}
	
	
}
