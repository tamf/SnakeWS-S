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
		// Horizontal gridlines
		for (int i = 0; i < board.getNumberOfRows(); i++) {
			window.drawLine(Colour.WHITE, topLeft.addY(cellSize * i), topLeft.addXY(window.getWidth(), cellSize * i));
		}

		// Vertical gridlines
		for (int i = 0; i < board.getNumberOfColumns(); i++) {
			window.drawLine(Colour.WHITE, topLeft.addX(cellSize * i), new Point(cellSize * i, window.getHeight()));
		}
	}

	public void drawSquare(Colour colour, Position p) {

	}
	

	public void drawTriangle(Colour colour, Direction direction, Position p) {

	}
}
