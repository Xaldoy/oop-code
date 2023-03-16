package hr.fer.oop.inheritance_polymorphism;

public class Item {
	private String sku;
	private String name;
	private double netSalePrice;

	public Item(String sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.netSalePrice = price;
	}

	public Item(String sku, String name) {
		this(sku, name, 0);
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNetSalePrice() {
		return this.netSalePrice;
	}

	public void setNetSalePrice(double netSalePrice) {
		this.netSalePrice = netSalePrice;
	}
	
	public double getVAT() {
		return 0.25;
	}

	public double getPrice(int count) {
		return count * getNetSalePrice() * (1 + getVAT());
	}

	public String getItemType() {
		return "";
	}

	@Override
	public String toString() {
		return String.format("%s - %s", getSku(), getName());
	}
}
