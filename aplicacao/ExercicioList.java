package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class ExercicioList {
	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Jorge");
		lista.add("Alex");
		lista.add("Humberto");
		lista.add("Karen");
		lista.add("Camille");
		for(String l : lista) {
			System.out.println(l);
		}
		lista.removeIf(x -> x.charAt(0)=='A');
		System.out.println();
		for(String l : lista) {
			System.out.println(l);
		}
		
	}
}
