package hr.fer.oop.food;

public class Main {
	public static void main(String[] args) {
		FoodType foodType = new FoodType("banana", 4, 93, 3);
		Food food = new Food(foodType, 110);
		System.out.println("protein: " + food.getProtein() + "\ncarbs: " + food.getCarbs() + "\nfat: " + food.getFat());
	}
}
