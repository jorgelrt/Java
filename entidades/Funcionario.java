package entidades;

public class Funcionario {
	private Integer id;
	private String nome;
	private Double salario;
	//Construtor
	public Funcionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	//Outros métodos
	public String toString() {
		return id
				+", "
				+nome
				+", R$ "
				+String.format("%.2f", salario);
	}
	
	public void aumentarSalario(Integer percentual) {
		salario += (salario*percentual)/100;
	}
}
