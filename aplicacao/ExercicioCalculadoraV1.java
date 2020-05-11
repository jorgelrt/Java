package aplicacao;

import java.util.Scanner;

public class ExercicioCalculadoraV1 {
	public static final double PI = 3.1416; //membro estático
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double numero = sc.nextDouble();
		
		System.out.println("Circunferencia: "+circunferencia(numero));
		System.out.println("Volume: "+volume(numero));
		System.out.println("PI: "+PI);
		
		sc.close();
	}
	//funções personalizadas
	public static double circunferencia(double raio) {
		return 2.0*PI*raio;
	}
	 public static double volume(double raio) {
		 return 4.0*PI*raio*raio*raio/3;
	 }
	 

}
