package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	//Construtores
	public Piece(Board board) {
		this.board = board; //so devemos informar o tabuleiro q a peça pertence
		position = null;//aposição de uma peça recem criada deve ser nula
	}
	//Getters and Setters
	/*
	 *  public para protected,somente classes dentro do pacote e subclasses acessem o tabuleiro de uma peça. 
	 *  O tabuleiro não será visto pela camada superior
	 */
	protected Board getBoard() {
		return board;
	}
	/*
	 *   não vamos permitir que o tabuleiro seja alterado
	 
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
	
	
}
