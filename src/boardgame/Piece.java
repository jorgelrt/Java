package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	//Construtores
	public Piece(Board board) {
		this.board = board; //so devemos informar o tabuleiro q a pe�a pertence
		position = null;//aposi��o de uma pe�a recem criada deve ser nula
	}
	//Getters and Setters
	/*
	 *  public para protected,somente classes dentro do pacote e subclasses acessem o tabuleiro de uma pe�a. 
	 *  O tabuleiro n�o ser� visto pela camada superior
	 */
	protected Board getBoard() {
		return board;
	}
	/*
	 *   n�o vamos permitir que o tabuleiro seja alterado
	 
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
	
}
