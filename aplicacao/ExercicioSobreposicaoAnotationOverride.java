package aplicacao;

import entidades.Account;
import entidades.BusinnessAccount;
import entidades.SavingsAccount;

public class ExercicioSobreposicaoAnotationOverride {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Jorge", 1000.00);
		acc.withdraw(200.00);
		System.out.println(acc.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Alex", 1000.00, 0.25);
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinnessAccount(1003, "Bob", 1000.00, 500.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
	}
}
