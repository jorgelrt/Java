package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetorAlturaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Double totalAltura = 0.0;
		
		
		System.out.print("Informe a quantidade de pessoas: ");
		int qtd = sc.nextInt();
		
		Double[] vetAltura = new Double[qtd];
		
		for(int i=0; i<vetAltura.length; i++) {
			System.out.print((i+1)+"ª: ");
			Double altura = sc.nextDouble();
			totalAltura += altura;
		}
		
		System.out.println("Média de altura: "+totalAltura/vetAltura.length);
		sc.close();
	}

}
