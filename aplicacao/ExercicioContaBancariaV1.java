package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBancaria;

public class ExercicioContaBancariaV1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer nrocc = 1;
		ContaBancaria c1;
		
		
		System.out.println("1 - Abrir Conta Corrente (sem deposito)");
		System.out.println("2 - Abrir Conta Corrente (com deposito)");
		
		
		System.out.print(">>: ");
		int opc = sc.nextInt();
		sc.nextLine();
		switch(opc) {
		case 1:
			System.out.print("Titular: ");
			String titular = sc.nextLine();
			c1 = new ContaBancaria(nrocc, titular);
			System.out.println("");
			System.out.println("Conta Corrente aberta");
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			System.out.print("Valor p/ deposito: ");
			Double Deposito = sc.nextDouble();
			c1.depositar(Deposito);
			System.out.println("Saldo atualizado");
			System.out.println();
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			System.out.print("Valor p/ saque: ");
			Double saque = sc.nextDouble();
			c1.saque(saque);
			System.out.println("Saldo atualizado");
			System.out.println();
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			
			break;
		case 2:
			nrocc += 1;
			System.out.print("Titular: ");
			titular = sc.nextLine();
			System.out.print("Depósito: ");
			Double valor = sc.nextDouble();
			c1 = new ContaBancaria(nrocc, titular, valor);
			System.out.println("");
			System.out.println("Conta Corrente aberta");
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			System.out.print("Valor p/ deposito: ");
			Deposito = sc.nextDouble();
			c1.depositar(Deposito);
			System.out.println("Saldo atualizado");
			System.out.println();
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			System.out.print("Valor p/ saque: ");
			saque = sc.nextDouble();
			c1.saque(saque);
			System.out.println("Saldo atualizado");
			System.out.println();
			System.out.println("Nr.: "+c1.getNrocc());
			System.out.println("Titular: "+c1.getTitular());
			System.out.println("Saldo: "+String.format("%.2f", c1.getSaldo()));
			System.out.println();
			break;
		default:
			System.out.println("Opção inválida!");
		}//final switch
		
		sc.close();	

	}

}
