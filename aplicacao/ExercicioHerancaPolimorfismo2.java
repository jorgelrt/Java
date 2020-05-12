package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ImportedProduct;
import entidades.Product;
import entidades.UsedProduct;

public class ExercicioHerancaPolimorfismo2 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> listaProdutos = new ArrayList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String name;
		Double price;
		
		System.out.print("Informe a qtd produtos: ");
		Integer qtdProds = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<qtdProds;i++) {
			System.out.println("Dados do #"+(i+1)+" produto");
			System.out.print("Produto Comum, usado ou importado (C/U/I) >>: ");
			char tpProd = sc.next().charAt(0);
			sc.nextLine();
			tpProd = Character.toUpperCase(tpProd);
			if(tpProd == 'C') {
				System.out.print("Nome: ");
				name = sc.nextLine();
				System.out.print("Preço: ");
				price = sc.nextDouble();
				sc.nextLine();
				listaProdutos.add(new Product(name, price));
			}if(tpProd == 'I') {
				System.out.print("Nome: ");
				name = sc.nextLine();
				System.out.print("Preço: ");
				price = sc.nextDouble();
				System.out.print("Taxa importação: ");
				Double customfree = sc.nextDouble();
				sc.nextLine();
				listaProdutos.add(new ImportedProduct(name, price, customfree));
			}if(tpProd == 'U') {
				System.out.print("Nome: ");
				name = sc.nextLine();
				System.out.print("Preço: ");
				price = sc.nextDouble();
				System.out.print("Data de fabricação: ");
				Date manufacture = sdf.parse(sc.next());
				listaProdutos.add(new UsedProduct(name, price, manufacture));
			}
			
		}//final for
		
		System.out.println("PREÇOS");
		for(Product p : listaProdutos) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}

}
