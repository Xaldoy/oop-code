package hr.fer.oop.audit4;

public abstract class SeaAnimal extends Animal{
	
	private SeaSpecies species;
	
	public SeaAnimal(SeaSpecies species) {
		this.species = species;
	}
	
	@Override
	public final void introduceYourself() {
		System.out.println("I am a sea animal.");
	}
	
	public abstract void wayOfMovement();
	
	public void printSpecies() {
		System.out.println("Species: " + this.species);
	}
}
