package hr.fer.oop.audit4;

public class Fish extends SeaAnimal{
	
	public Fish() {
		super(SeaSpecies.FISH);
	}
	
	@Override
	public void wayOfMovement(){
		System.out.println("Finns.");
	}
}
