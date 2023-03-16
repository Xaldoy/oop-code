package hr.fer.oop.simple;

public class CreateRandomNumbers {
	public static void main(String[] args) {
		
		int ArgInt[];
		ArgInt = new int[2];
		
		int RandInt[];
		RandInt = new int[2];

		ArgInt[0] = Integer.parseInt(args[0]);
		ArgInt[1] = Integer.parseInt(args[1]);
		
		if(args.length != 2) {
			System.out.println("Program requires lower and upper bound");
			System.exit(1);
		}
		if(ArgInt[0] >= ArgInt[1]) {
			System.out.println("Invalid bounds");
			System.exit(1);
		}
		
		RandInt[0] = (int)(ArgInt[0] + Math.random() * (ArgInt[1]-ArgInt[0]));
		do {
			RandInt[1] = (int)(ArgInt[0] + Math.random() * (ArgInt[1]-ArgInt[0]));
		}
		while(RandInt[0] == RandInt[1]);
		
		System.out.printf("Two different random numbers in range [%d, %d] are %d and %d",ArgInt[0],ArgInt[1],RandInt[0],RandInt[1]);
		
	}
}
