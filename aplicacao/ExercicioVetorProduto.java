package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class ExercicioVetorProduto {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a qtd de produtos: ");
		int qtdProd = sc.nextInt();
		Produto[] vetProd = new Produto[qtdProd];
		sc.nextLine();
		for(int i=0; i<vetProd.length; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			Double preco = sc.nextDouble();
			sc.nextLine();
			System.out.print("Qtd: ");
			Integer qtd = sc.nextInt();
			sc.nextLine();
			vetProd[i] = new Produto(nome, preco, qtd);
		}
		//duas formas de dar saida no vetor tipo Produto
		for(int i=0; i<vetProd.length; i++) {
			System.out.println(vetProd[i].getNome()+", R$ "+String.format("%.2f", vetProd[i].getPreco())+", Qtd: "+vetProd[i].getQtd());
		}
		
		for(Produto prod : vetProd) {
			System.out.println(prod.getNome()+", R$ "+String.format("%.2f", prod.getPreco())+", Qtd: "+prod.getQtd());
		}
		sc.close();
	}
}
