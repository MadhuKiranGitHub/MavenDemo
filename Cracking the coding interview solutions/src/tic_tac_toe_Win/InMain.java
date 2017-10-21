package tic_tac_toe_Win;

import java.util.Iterator;

public class InMain {
	enum Piece { Empty, Red, Blue };
	class Position {
		public int row, column;
		public Position(int row, int column) {
			this.row = row;
			this.column = column;
		}
	}

 class PositionIterator implements Iterator<Position> {
	private int rowIncrement, colIncrement, size;
	private Position current;
	
	public PositionIterator(Position p, int rowIncrement, int colIncrement, int size) {
		this.rowIncrement = rowIncrement;
		this.colIncrement = colIncrement;
		this.size = size;
		current = new Position(p.row - rowIncrement, p.column - colIncrement);
	}
	
	@Override
	public boolean hasNext() {
		return current.row + rowIncrement < size && current.column + colIncrement < size;
	}

	@Override
	public Position next() {
		current = new Position(current.row + rowIncrement, current.column + colIncrement);
		return current;
	}
}
	public static int convertBoardToInt(Piece[][] board) {
		int sum = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int value = board[i][j].ordinal();
				sum = sum * 3 + value;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Piece[][] board = { 
				{Piece.Empty, Piece.Empty, Piece.Empty},
				{Piece.Empty, Piece.Empty, Piece.Empty},
				{Piece.Blue, Piece.Blue, Piece.Blue}};
		
		int v = convertBoardToInt(board);
		System.out.println(v);
	}
}
