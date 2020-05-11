package entidades;

public class AluguelQuarto {
	private String nome;
	private String telefone;
	private Integer nrquarto;
	//Construtor
	public AluguelQuarto(String nome, String telefone, Integer nrquarto) {
		this.nome = nome;
		this.telefone = telefone;
		this.nrquarto = nrquarto;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getNrquarto() {
		return nrquarto;
	}
	public void setNrquarto(Integer nrquarto) {
		this.nrquarto = nrquarto;
	}
	//Outros
	public String toString() {
		return "Nr. Quarto: "
				+nrquarto
				+", nome "
				+nome
				+", tel.: "
				+telefone;
	}
	
}
