package entidades;

public class Fisica extends Pessoa {
	
	private Double gastoSaude;
	
	//Construtor
	public Fisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	//Getters and Setters
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	//Outros
	@Override
	public Double calculaIR() {
		Double valor;
		if(rendaAnual < 20000.00) {
			valor = (rendaAnual*15/100)-(gastoSaude*50/100);
		}else {
			valor = (rendaAnual*25/100)-(gastoSaude*50/100);
		}
		return valor;
		
	}

	
	
	
	
}
