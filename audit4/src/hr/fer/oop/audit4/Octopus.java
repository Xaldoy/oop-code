package hr.fer.oop.audit4;

public class Octopus extends SeaAnimal{
	
	public Octopus() {
		super(SeaSpecies.CEPHALOPOD);
	}
	
	
	@Override
	public void wayOfMovement() {
		System.out.println("Tentacles.	");
	}
}
