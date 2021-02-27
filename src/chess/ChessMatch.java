package chess;

import boardgame.Board;
/*
 * Coração do sistema, onde conterá as regras do xadrez
 */
public class ChessMatch {
	private Board board;
	
	//Construtor
	public ChessMatch() {
		// Esta classe que tem q saber a dimensão do tabuleiro
		board = new Board(8,8);
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
}
