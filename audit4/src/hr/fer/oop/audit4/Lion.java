package hr.fer.oop.audit4;

public class Lion extends Animal implements MakeSound {
	
	@Override
	public void introduceYourself() {
		System.out.println("I am a Lion.");
	}
	
	@Override
	public void makeSound(){
		System.out.println("Roar.");
	}
}
