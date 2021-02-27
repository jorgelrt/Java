package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;
/*
 * Coração do sistema, onde conterá as regras do xadrez
 */
public class ChessMatch {
	private Board board;
	
	//Construtor
	public ChessMatch() {
		// Esta classe que tem q saber a dimensão do tabuleiro
		board = new Board(8,8);
		initialSetup();
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
	//metodo resp. por colocar as peças no tabuleiro
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
}
