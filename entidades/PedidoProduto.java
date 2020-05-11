package entidades;

public class PedidoProduto {
	private Integer quantidade;
	private Double preco;
	private Produto2 produto;
	//Construtor
	public PedidoProduto(Integer quantidade, Double preco, Produto2 produto) {
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}
	//Getters and Setters
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto2 getProduto() {
		return produto;
	}
	public void setProduto(Produto2 produto) {
		this.produto = produto;
	}
	//Outros
	public Double subTotal() {
		return preco*quantidade;
	}
	public String toString() {
		return produto.getNome()
				+", R$ "
				+String.format("%.2f", preco)
				+", qtd: "
				+quantidade
				+", subTotal: R$ "
				+String.format("%.2f", subTotal());
	}
}
