package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ExercicioProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Cadastrar produto com preço?(S/N) >>: ");
		char opc = sc.next().charAt(0);
		opc = Character.toUpperCase(opc);
		sc.nextLine();
		if(opc == 'N') {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			Produto prod = new Produto(nome, preco);
			System.out.println(prod);
			
			System.out.print("Entrada no estoque: ");
			Integer entrada = sc.nextInt();
			prod.addProduto(entrada);
			System.out.println(prod);
			System.out.print("Saida no estoque: ");
			Integer saida = sc.nextInt();
			prod.remProduto(saida);
			System.out.println(prod);
		}else {		
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			System.out.print("Qtd: ");
			Integer qtd = sc.nextInt();
			Produto prod = new Produto(nome, preco, qtd);
			System.out.println(prod);
			
			System.out.print("Entrada no estoque: ");
			Integer entrada = sc.nextInt();
			prod.addProduto(entrada);
			System.out.println(prod);
			System.out.print("Saida no estoque: ");
			Integer saida = sc.nextInt();
			prod.remProduto(saida);
			System.out.println(prod);
			sc.close();
		}
	}
}
