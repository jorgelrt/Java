package aplicacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Fisica;
import entidades.Juridica;
import entidades.Pessoa;

public class ExercicioHerancaClasseAbstract {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH/mm/ss");
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> listaIR = new ArrayList<>();
		
		System.out.print("Informe quantos IR a calcular: ");
		Integer qtdIR = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<qtdIR; i++) {
			System.out.println("Cálculo do "+(i+1)+" contribuinte:");
			System.out.println("Pessoa Fisica ou Pessoa Jurídica (PF/PJ)");
			System.out.print(">>: ");
			String tpPess = sc.next().toUpperCase();
			sc.nextLine();
			if(tpPess.equals("PF")){
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				Double rendaAnual = sc.nextDouble();
				sc.nextLine();
				System.out.print("Gastos com Saúde: ");
				Double gastoSaude = sc.nextDouble();
				sc.nextLine();
				listaIR.add(new Fisica(nome, rendaAnual, gastoSaude));
			}
			if(tpPess.equals("PJ")) {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Renda Anual: ");
				Double rendaAnual = sc.nextDouble();
				sc.nextLine();
				System.out.print("NºFuncinarios: ");
				Integer nroFunc = sc.nextInt();
				sc.nextLine();
				listaIR.add(new Juridica(nome, rendaAnual, nroFunc));
			}	
		}//fim for
		System.out.println();
		System.out.println("Valores a pagar");
		for(Pessoa IR : listaIR) {
			System.out.println(sdf.format(new Date()));
			System.out.println("Contribuinte: "+IR.getNome()+" valor a pagar R$"+String.format("%.2f", IR.calculaIR()));
			System.out.println();
		}
		sc.close();
	}
}
