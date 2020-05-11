package aplicacao;

import java.util.Scanner;

import entidades.Calculadora;

public class ExercicioCalculadoraV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		double numero = sc.nextDouble();
		
		Calculadora cal1 = new Calculadora();
		
		System.out.println("Circunferencia: "+cal1.circunferencia(numero));
		System.out.println("Volume: "+cal1.volume(numero));
		System.out.println("PI: "+cal1.PI);
		sc.close();
	}
}
