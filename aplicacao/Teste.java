package aplicacao;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe os nomes entre espaços");
		String[] vetNomes = sc.nextLine().split(" ");
		int pos = sc.nextInt();
		System.out.println(vetNomes[pos]);
	}

}
