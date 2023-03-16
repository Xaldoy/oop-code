package hr.fer.oop.food;

public class FoodType {
	private String name;
	private int protein;
	private int carbs;
	private int fat;

	private static int counter = 0;

	public FoodType(String name, int protein, int carbs, int fat) {
		this.name = name;
		this.protein = protein;
		this.carbs = carbs;
		this.fat = fat;
		FoodType.counter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	@Override
	public String toString() {
		return String.format("%s: p - %d%%, c - %d%%, f - %d%%", name, protein, carbs, fat);
	}
	
	public static int getNumberOfCreatedInstances() {
		return counter;
	}

}
