package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class ExercicioFuncionarioList {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> ListaFunc = new ArrayList<>();
		
		int id = 1;
		
		System.out.print("Informe a qtd de funcionarios: ");
		Integer qtdLeitura = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<qtdLeitura; i++) {
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			Double salario = sc.nextDouble();
			sc.nextLine();
			ListaFunc.add(new Funcionario(id, nome, salario));
			id++;
		}
		
		System.out.print("Informe o id do funcionario p/ executar aumento salarial: ");
		Integer idPesq = sc.nextInt();
		sc.nextLine();
		System.out.print("Informe percentual de aumento: ");
		Integer perc = sc.nextInt();
		
		for(Funcionario list : ListaFunc) {
			if(list.getId() == idPesq) {
				list.aumentarSalario(perc);
			}
		}
		
		for(Funcionario list : ListaFunc) {
			System.out.println(list);
		}
		sc.close();
	}
}
