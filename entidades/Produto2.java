package entidades;

public class Produto2 {
	private String nome;
	private Double preco;
	//Construtor
	public Produto2(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	/* Outros
	public String toString() {
		return nome
				+", R$ "
				+String.format("%.2f", preco);
	}
	*/
}
