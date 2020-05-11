package entidades;
public class Produto {
	private String nome;
	private Double preco;
	private Integer qtd;
	//Construtor
	public Produto(String nome, Double preco, Integer qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = 0;
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
	
	public Integer getQtd() {
		return qtd;
	}
	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	public String toString() {
		return nome
				+", $ "
				+String.format("%.2f", preco)
				+", qtd: "
				+qtd;
	}
	
	public Double totalValorEstoque() {
		return (Double)preco*qtd;
	}
	
	public void addProduto(Integer entrada) {
		this.qtd += entrada;
	}
	
	public void remProduto(Integer saida) {
		this.qtd -=  saida;
	}
}
