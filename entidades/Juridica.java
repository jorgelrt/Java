package entidades;

public class Juridica extends Pessoa {
	
	private Integer nroFuncionarios;
	
	//Construtor
	public Juridica(String nome, Double rendaAnual, Integer nroFuncionarios) {
		super(nome, rendaAnual);
		this.nroFuncionarios = nroFuncionarios;
	}

	@Override
	public Double calculaIR() {
		if(nroFuncionarios <= 10) {
			return (rendaAnual*16/100);
		}else {
			return (rendaAnual*14/100);
		}
	}
	
	
}
