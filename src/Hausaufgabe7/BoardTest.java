package Hausaufgabe7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {
	Board board;
	String mark;
	@Before
	public void initialize(){
		 board = new Board();
	}
	@Test
	public void testLeeresBoard() {
		assertFalse(board.hasWinner());
	}
	@Test
	public void testSetMarkNoWinner() {
		try{
			board.setMark("x", 1, 2);
		} catch (InvalidPositionException e){
			e.getMessage();
		}
		assertFalse(board.hasWinner());
	}
	@Test
	public void testSetMarkWithWinner() {
		try{
			board.drawBoard();
			board.setMark("x", 1, 2);
			board.drawBoard();
			board.setMark("x", 0, 2);
			board.drawBoard();
			board.setMark("x", 2, 2);
			board.drawBoard();
		} catch (InvalidPositionException e){
			e.getMessage();
		}
		assertTrue(board.hasWinner());
	}
	@Test (expected = InvalidPositionException.class)
	public void testSetMarkAtInvalid() throws InvalidPositionException {
			board.setMark("x", 1, 4);
	}
}
