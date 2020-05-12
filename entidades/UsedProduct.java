package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacture;
	
	public UsedProduct(String name, Double price, Date manufacture) {
		super(name, price);
		this.manufacture = manufacture;		
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name+" (Usado) $ "+String.format("%.2f", price)+" (Data fabricação: "+sdf.format(manufacture)+")");
		return sb.toString();
	}
	
	
}
