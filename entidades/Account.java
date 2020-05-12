package entidades;

public class Account {
	private Integer number;
	private String holder;
	protected Double balance;
	//Construtor
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	//Getters and Setters
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getBalance() {
		return balance;
	}
	//Outros
	public void withdraw(Double amount) {
		if(amount <= balance) {
			balance -= amount + 5.00;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
}
