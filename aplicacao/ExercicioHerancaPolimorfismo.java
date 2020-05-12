package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employee;
import entidades.OutsourceEmployee;

public class ExercicioHerancaPolimorfismo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listaemployees = new ArrayList<Employee>();
		
		System.out.print("Informe o numero de funcionarios: ");
		Integer qtdFunc = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<qtdFunc;i++) {
			System.out.println("Dados funcionario #"+(i+1));
			System.out.print("Funcionario Terceirizado?(S/N) >>: ");
			char terceirizado = sc.next().charAt(0);
			sc.nextLine();
			terceirizado = Character.toUpperCase(terceirizado);
	
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Horas: ");
			Integer hours = sc.nextInt();
			sc.nextLine();
			System.out.print("Valor da hora: ");
			Double valuePerHour = sc.nextDouble();
			sc.nextLine();
			if(terceirizado == 'N') {
				listaemployees.add(new Employee(name, hours, valuePerHour));
			}else {
				System.out.print("Adicional: ");
				Double additionalCharge = sc.nextDouble();
				sc.nextLine();
				listaemployees.add(new OutsourceEmployee(name, hours, valuePerHour,additionalCharge));
			}
			
		}//end for
		System.out.println("Pagamentos");
		for(Employee e : listaemployees) {
			System.out.println(e.getName()+" - $ "+e.payment());
		}
		sc.close();
	}

}
