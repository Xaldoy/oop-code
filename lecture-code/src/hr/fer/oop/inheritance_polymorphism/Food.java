package hr.fer.oop.inheritance_polymorphism;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food extends Item{
	
	private LocalDate shelflife;
	
	public LocalDate getShelflife() {
		return shelflife;
	}

	public void setShelflife(LocalDate shelflife) {
		this.shelflife = shelflife;
	}

	public Food(String sku, String name, LocalDate shelflife) {
		super(sku, name);
		this.shelflife = shelflife;
	}
	
	public Food(String sku, String name, double price, LocalDate shelflife) {
		super(sku,name,price);
		this.shelflife = shelflife;
	}
	
	@Override
	public String getItemType() {
		return "Food";
	}
	
	@Override
	public double getVAT() {
		return 0.13;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		s += ", best before: " + shelflife.format(formatter);
		return s;
	}
}
