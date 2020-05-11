package aplicacao;

import java.util.Scanner;

import entidades.Calculadora;

public class ExercicioCalculadoraV3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double numero = sc.nextDouble();
		
		System.out.println("Circunferencia: "+Calculadora.circunferencia(numero));
		System.out.println("Volume: "+Calculadora.volume(numero));
		System.out.println("PI: "+Calculadora.PI);
		sc.close();
	}
}
