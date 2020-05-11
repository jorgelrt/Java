package entidades;

public class ContaBancaria {
	public static final double TAXA = 5.00;
	
	private Integer nrocc;
	private String titular;
	private Double saldo;
	//Construtores
	public ContaBancaria(Integer numero_cc, String titular, Double depositoInicial) {
		this.nrocc = numero_cc;
		this.titular = titular;
		this.saldo = depositoInicial;
	}
	
	public ContaBancaria(Integer numero_cc, String titular) {
		this.nrocc = numero_cc;
		this.titular = titular;
		this.saldo = 0.0;
	}
	
	//Getters and Setters
	public Integer getNrocc() {
		return nrocc;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitulat(String titular) {
		this.titular = titular;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	
	//Outros métodos
	public void depositar(Double valor) {
		this.saldo += valor;
	}
	public void saque(Double valor) {
		if(valor+TAXA < saldo) {
			saldo -= valor+TAXA;
		}else {
			System.out.println("Saldo insufucuente!");
		}
	}
	
	public String toString() {
		return "Conta: "
				+nrocc
				+", Titular:  "
				+titular
				+", R$: "
				+String.format("%.2f", saldo);
	}
}
