package entidades;

public class SavingsAccount extends Account {
	private Double interestRate;
	//Construtor
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	//Getters and Setters
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	//Outros
	public void updateBalance() {
		balance += balance*interestRate;
	}
	//sobrescrevendo o método
	@Override
	public void withdraw(Double amount) {
		balance -= amount;
	}
}
