package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Circle;
import entidades.Rectangle;
import entidades.Shape;
import entidades.enums.ColorEstudo;

public class ExercicioClassesAbstratasHeranca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> listaFiguras = new ArrayList<Shape>();
		
		System.out.println("Informe a qtd de figuras que serão calculadas:");
		System.out.print(">>: ");
		Integer qtdFiguras = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<qtdFiguras; i++) {
			System.out.println("Dados da figura "+(i+1));
			System.out.print("Circulo ou Retangulo (C/R) >>: ");
			char tpFigura = sc.next().charAt(0);
			tpFigura = Character.toUpperCase(tpFigura);
			sc.nextLine();
			System.out.print("Cor preto, azul ou vermelho >>: ");
			ColorEstudo cor = ColorEstudo.valueOf(sc.next().toUpperCase());
			if(tpFigura == 'R') {
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				sc.nextLine();
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				sc.nextLine();
				listaFiguras.add(new Rectangle(cor, altura, largura));
			}
			if(tpFigura == 'C') {
				System.out.print("Area: ");
				Double area = sc.nextDouble();
				sc.nextLine();
				listaFiguras.add(new Circle(cor, area));
			}
		}
		System.out.println();
		
		for(Shape figura : listaFiguras) {
			System.out.println("Figura: "+figura.getClass().getName().substring(10).toUpperCase());
			System.out.println("Cor: "+figura.getColor());
			System.out.println("Area: "+String.format("%.2f", figura.area()));
			System.out.println();
		}
		
		sc.close();
		
	}

}
