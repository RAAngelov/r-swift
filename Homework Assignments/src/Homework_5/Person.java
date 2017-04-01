package Homework_5;

public class Person {
	private String name;
	private double balance;
	private int productsCount;

	private Product[] products;

	Person(String name,double balance){
		this.name = name;
		this.balance = balance;
		productsCount = 0;
		this.products = new Product[100];
	}
	String getName(){
		return name;
	}

	boolean tryBuy(Product product){
		if (balance >= product.getPrice()) {
			balance -= product.getPrice();
			products[productsCount++] = product;
			return true;
		}
		return false;
	}

	Product[] getProducts(){
		Product[] products = new Product[productsCount];
		for (int i = 0;i < productsCount;i++){
			products[i] = products[i];
		}
		return products;
	}
}
