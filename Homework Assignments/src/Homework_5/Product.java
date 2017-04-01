package Homework_5;

public class Product {
	private String name;
	private double price;

	Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

}
