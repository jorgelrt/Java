package boardgame;

public class Position {
	private int row;
	private int column;
	//Construtor
	public Position(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}
	//Getters and Setters
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	//Others
	@Override
	public String toString() {
		return row +", "+column;
	}
	
	
}
