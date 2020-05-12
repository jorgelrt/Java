package aplicacao;

import java.util.Date;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;

public class Teste {

	public static void main(String[] args) {
		
		Product e1 = new Product("Tablet", 260.00);
		
		Product e2 = new ImportedProduct("Notebook", 1100.00, 20.00);
		
		Product e3 = new UsedProduct("Iphone", 700.00, new Date());
		
		System.out.println(e1.priceTag());
		System.out.println(e2.priceTag());
		System.out.println(e3.priceTag());
		

	}

}
