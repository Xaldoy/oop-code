package hr.fer.oop.zi;

@FunctionalInterface
public interface StudentFactory <S extends Student> {
	S create(String lastName, String firstName, String studentID);
}
