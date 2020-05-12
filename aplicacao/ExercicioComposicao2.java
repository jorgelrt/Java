package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Department;
import entidades.HourContract;
import entidades.Worker;
import entidades.enums.WorkerLevel;

public class ExercicioComposicao2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Informe o Departamento: ");
		String departamento = sc.nextLine();
		
		System.out.println("Informe os dados do trabalhador: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivel = sc.nextLine().toUpperCase();
		System.out.print("Salario: ");
		Double salario = sc.nextDouble();
		sc.nextLine();
		Worker worker = new Worker(nome, WorkerLevel.valueOf(nivel), salario, new Department(departamento));
		
		System.out.print("Quantos contratos para este profissional ? >>: ");
		Integer qtdContratos = sc.nextInt();
		
		for(int i=0; i<qtdContratos; i++) {
			System.out.println("Informe dados #"+(i+1)+" contrato: ");
			System.out.print("Data (dd/mm/yyyy) >>: ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor da Hora: ");
			Double valorHora = sc.nextDouble();
			System.out.print("Duração: ");
			Integer duracao = sc.nextInt();	
			worker.addContract(new HourContract(data, valorHora, duracao));
		}
		System.out.println("Informe a data para calcular pagamento");
		System.out.println("data (MM/YYYY) >>: ");
		String data = sc.next();
		Integer mes = Integer.parseInt(data.substring(0,2));
		Integer ano = Integer.parseInt(data.substring(3));
		System.out.println("Nome: "+worker.getName());
		System.out.println("Departamento: "+worker.getDepartment().getName());
		System.out.println("Salario: "+String.format("%.2f", worker.income(mes, ano)));
		sc.close();
	}

}
