package hr.fer.oop;

public class Main {

	public static void main(String[] args) throws ParseReadingException {
		Reading r = Parser.parseInputString("{serialNumber : 2223, timestamp : 05-12-1992, currentReading : 284.3}");
	}
	
}
