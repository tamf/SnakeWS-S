package snake.game.drawer;

import simpleio.common.Colour;
import simpleio.common.Direction;
import simpleio.common.Point;
import simpleio.common.Position;
import simpleio.display.Window;
import snake.game.state.Board;

public class BoardDrawer {
	private Window window;
	private Point topLeft;
	private int cellSize;

	public BoardDrawer(Window window, Point topLeft, int cellSize) {
		this.window = window;
		this.topLeft = topLeft;
		this.cellSize = cellSize;
	}

	public void drawBoard(Board board) {
		BoardDrawer newBoard = new BoardDrawer(new Window("Snake Game Grid", cellSize * 15, cellSize * 15 + 36), new Point (0, 36), 24);
	}

	public void drawSquare(Colour colour, Position p) {

	}
	

	public void drawTriangle(Colour colour, Direction direction, Position p) {

	}
}
