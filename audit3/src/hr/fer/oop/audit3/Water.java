package hr.fer.oop.audit3;

public class Water {

	public static void main(String[] args) {
		Water container = new Water(500);
		container.AddWater(410);
		container.AddCube(2);
	}

	int volume;
	int watervol;
	int cubecount;

	public Water(int volume) {
		this.volume = volume;
	}

	public void AddWater(int watervol) {

		this.watervol += watervol;
		System.out.printf("Added %dml.%n", watervol);
		Overflow();
	}

	public void AddCube(int cubecount) {
		this.cubecount += cubecount;
		System.out.println("Added " + cubecount + " cubes.");
		Overflow();
	}

	private void Overflow() {
		int maxcubes = 0;
		int overflowed = watervol + 50 * cubecount - volume;
		boolean overflowedwater = false;
		boolean overflowedcubes = false;
		if (overflowed > 0) {
			if (watervol >= overflowed) {
				watervol -= overflowed;
				overflowedwater = true;
			} else {
				maxcubes = (overflowed - watervol) / 50 + 1;
				watervol = 0;
				cubecount -= maxcubes;
				overflowedcubes = true;
			}
		}

		int filled = watervol + 50 * cubecount;
		System.out.printf("Filled with: %d ml, %d cubes. (Total: %d)%n", watervol, cubecount, filled);
		if (overflowedcubes)
			System.out.println("Overflowed Cubes: " + maxcubes);
		if (overflowedwater)
			System.out.println("Overflowed Water: " + overflowed + "ml.");
		System.out.println();
	}
}
