package tetris;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.awt.*;

class TetrisTest {
	
	private GameController game;
	private Board board;
	
	@BeforeEach
	void setUp() {
		game = new GameController();
		board = new Board();
	}

	@Test
	void testInitialScoreIsZero() {
			assertEquals(0, game.currentScore(), "The score doesn't initialize as zero");
		}
	
	@Test
	void testPieceCanMoveDown() {
		Tetromino piece = new Tetromino(new Point[] { new Point(4,				
		0), new Point(5,0) }, Color.RED);
	}

	@Test
	void testPieceCannotMoveOutsideLeft() {
		for (int x = 0; x < 10; x++) {
				board.grid[19][x] = Color.GREEN;
		}
	}
	}
