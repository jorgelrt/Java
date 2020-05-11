package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private String email;
	private Date nasc;
	//Construtor
	public Cliente(String nome, String email, Date nasc) {
		this.nome = nome;
		this.email = email;
		this.nasc =  nasc;				
	}
	//Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getNasc() {
		return nasc;
	}
	public void setNasc(Date nasc) {
		this.nasc = nasc;
	}
	public String toString() {
		return nome
				+", email: "
				+email
				+", Nasc.: "
				+sdf.format(nasc);
	}
}
