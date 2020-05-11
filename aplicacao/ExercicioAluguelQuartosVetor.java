package aplicacao;

import java.util.Scanner;

import entidades.AluguelQuarto;

public class ExercicioAluguelQuartosVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		AluguelQuarto[] vetOcupados = new AluguelQuarto[10];
		
		System.out.print("Informe a qtd de reservas: ");
		int qtd = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<qtd; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Telefone: ");
			String telefone = sc.nextLine();
			System.out.print("Nr Quarto: ");
			int nrquarto = sc.nextInt();
			sc.nextLine();
			vetOcupados[nrquarto] = new AluguelQuarto(nome, telefone, nrquarto);
		}
		
		for(int i=0; i<vetOcupados.length; i++) {
			if(vetOcupados[i] != null) {
				System.out.println();
				System.out.println("Nr.: "+vetOcupados[i].getNrquarto());
				System.out.println("Nome: "+vetOcupados[i].getNome());
				System.out.println("Telefone: "+vetOcupados[i].getTelefone());
			}
		}
		sc.close();
			

	}

}
