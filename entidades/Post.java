package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> listaComentarios = new ArrayList<Comment>();
	//Construtor
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	//Getters and Setters
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public List<Comment> getListaComentarios() {
		return listaComentarios;
	}
	public void addComments(Comment comentario) {
		listaComentarios.add(comentario);
	}
	public void remComments(Comment comentario) {
		listaComentarios.remove(comentario);
	}
	//Outros
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes+" - "+sdf.format(getMoment())+"\n");
		sb.append("Jorge postou -> "+content+"\n");
		sb.append("Comentários:\n");
		for(Comment c : listaComentarios) {
			sb.append(c.getText()+"\n");
		}
		return sb.toString();
	}
	
	
	
}
