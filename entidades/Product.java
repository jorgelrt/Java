package entidades;

public class Product {
	protected String name;
	protected Double price;
	//Construtor
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	//Outros
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+" - $ "+String.format("%.2f", price));
		return sb.toString();
	}
	
}
