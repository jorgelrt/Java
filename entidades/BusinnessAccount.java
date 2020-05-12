package entidades;

public class BusinnessAccount extends Account {
	private Double loanLimit;
	//Construtor
	public BusinnessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	//Getters and Setters
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	//Outros
	public void loan(Double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
