package aplicacao;

import java.util.Date;

import entidades.Comment;
import entidades.Post;

public class ExercicioComposicaoStringBuilder {

	public static void main(String[] args) {
		
		Post p1 = new Post(new Date(), "Aprendendo Java", "Estudando muito", 2);
		
		Comment c1 = new Comment("Vc consegue, Papai. Te amo muito");
		Comment c2 = new Comment("Não desista, força!");
		
		p1.addComments(c1);
		p1.addComments(c2);
		
		Post p2 = new Post(new Date(), "Obrigado Deus, pela oportunidade de trabalho", "Agradecido", 2);
		
		Comment c3 = new Comment("Amém...");
		Comment c4 = new Comment("Deus é maravilhoso");
		
		p2.addComments(c3);
		p2.addComments(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		

	}

}
