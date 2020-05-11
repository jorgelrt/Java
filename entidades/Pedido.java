package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.StatusPagamento;

public class Pedido {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momento;
	private StatusPagamento status;
	
	private Cliente cliente;
	private List<PedidoProduto> listaItens = new ArrayList<PedidoProduto>();
	//Construtor
	public Pedido(Date momento, StatusPagamento status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}
	//Getters and Setters
	public Date getMomento() {
		return momento;
	}
	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public StatusPagamento getStatus() {
		return status;
	}
	public void setStatus(StatusPagamento status) {
		this.status = status;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<PedidoProduto> getListaItens(){
		return listaItens;
	}
	public void addListaItem(PedidoProduto item) {
		listaItens.add(item);
	}
	public void remListaItem(PedidoProduto item) {
		listaItens.remove(item);
	}
	public Double total() {
		Double totalGeral = 0.0;
		for(PedidoProduto item : listaItens) {
			totalGeral += item.subTotal();
		}
		return totalGeral;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Realizado em: "+sdf.format(momento));
		sb.append("\nStatus: "+status+"\n");
		sb.append("Cliente: "+cliente+"\n");
		sb.append("Itens do pedido: \n");
		int i=1;
		for(PedidoProduto item : listaItens) {
			sb.append(i+"º item: "+item+"\n");
			i+=1;
		}
		sb.append("Total Geral: "+String.format("%.2f", total()));
		
		return sb.toString();
	}
}
