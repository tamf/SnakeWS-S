package snake.game.drawer;

import simpleio.common.Colour;
import simpleio.common.Direction;
import simpleio.common.Point;
import simpleio.common.Position;
import simpleio.display.Window;
import snake.game.SnakeGame;
import snake.game.state.Board;

public class BoardDrawer {
	
	// Constants
	private static final Colour GL_COLOUR = Colour.WHITE;
	private static final int STARTING_X = 0;
	
	private Window window;
	private int headerHeight = SnakeGame.HEADER_HEIGHT;
	private int cellSize = SnakeGame.CELL_SIZE;
	private int windowWidth = SnakeGame.WINDOW_WIDTH;
	private int windowHeight = SnakeGame.WINDOW_HEIGHT;
	private int numberOfCells = SnakeGame.NUMBER_OF_CELLS;
	private Point topLeft = new Point(STARTING_X, headerHeight);

	public BoardDrawer(Window window, Point topLeft, int cellSize) {
		this.window = window;
		this.topLeft = topLeft;
		this.cellSize = cellSize;
	}

	public void drawBoard(Board board) {
		// Horizontal gridlines
		for (int i = 0; i < numberOfCells; i++) {
			Window.drawLine(GL_COLOUR, topLeft.addY(cellSize * i), new Point(windowWidth, headerHeight + cellSize * i));
		}

		// Vertical gridlines
		for (int i = 0; i < numberOfCells; i++) {
			Window.drawLine(GL_COLOUR, topLeft.addX(cellSize * i), new Point(cellSize * i, windowHeight));
		}
	}

	public void drawSquare(Colour colour, Position p) {

	}

	public void drawTriangle(Colour colour, Direction direction, Position p) {

	}
}
