package aplicacao;

import entidades.Account;
import entidades.BusinnessAccount;
import entidades.SavingsAccount;

public class ExercicioDownUpCastingHeranca {

	public static void main(String[] args) {
		
		Account acc = new Account(12345, "Jorge Luiz", 4000.00);
		
		BusinnessAccount bacc = new BusinnessAccount(54321, "JLRTINFOSERV", 1000.00, 500.00);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinnessAccount(6789, "Alex Morgado LTDA", 1000.00, 500.00);
		Account acc3 = new SavingsAccount(98765, "Alex Morgado", 200.00, 0.25);
		
		//DOWNCASTING
		
		BusinnessAccount bacc1 = (BusinnessAccount)acc2;
		bacc.loan(100.00);
		
		//BusinnessAccount acc5 = (BusinnessAccount)acc3;
		if(acc3 instanceof BusinnessAccount) {
			BusinnessAccount acc5 = (BusinnessAccount)acc3;
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			System.out.println("UPDATE");
		}
	}

}
