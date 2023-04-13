package hr.fer.oop.audit4;

public class Main {
	public static void main(String[] args) {
		Animal lion = new Lion();
		lion.introduceYourself();
		Animal a = new Octopus();
		a.introduceYourself();
		// notice that we cannot write a.wayOfMovement()
		SeaAnimal b = new Octopus();
		b.introduceYourself();
		b.wayOfMovement();
		Fish c = new Fish();
		c.introduceYourself();
		c.wayOfMovement();
	}

}
