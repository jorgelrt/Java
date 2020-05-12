package entidades;

public class ImportedProduct extends Product{
	
	private Double customsFree;
	//Construtor
	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;	
	}
	//Getters and Setters
	public Double getCustomsFree() {
		return customsFree;
	}
	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+" - $ "+String.format("%.2f", totalPrice())+" (Taxa alfandega: "+String.format("%.2f", customsFree)+")");
		return sb.toString();
	}
	
	public Double totalPrice() {
		return getPrice()+getCustomsFree();
	}

	
	
	
}
