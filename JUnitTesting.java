package Week8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;
import org.junit.jupiter.api.Test;

class JUnitTesting {

	
	@Test
	public void gameOverIsOver() {
		//This test tests to see if the game is over
		Board board = new Board();
		
		assertEquals(false, board.gameOver());
	}
	
	
	
	@Test
	public void checkWinStatusIsFalse() {
		//This method checks the win status to make sure its false if board empty
		Board board = new Board();
		assertFalse(board.checkWinStatus());
	}
	
		
	@Test
	public void setSymbolSets() {
		//This tests that the setsymbol actually sets
		Player player = new Player('x');
		player.setSymbol('x');
		assertEquals('x', player.getSymbol());
	}
	
	@Test
	public void isBoardFullIsEmpty() {
		//This test tests that the board is empty when full or vice versa.
		Board board = new Board();
		assertTrue(board.isBoardFull());
	}
	
	@Test
	public void boardIsABoard() {
		//This test that the board is actually made
		Board board = new Board();
		String [][]expectedboard = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
		assertArrayEquals(expectedboard, board.getBoard());
	}
	
}



