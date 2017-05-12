import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_isFirstThrowStrike() throws BowlingException {
		Frame fr = new Frame(10, 0);
		assertTrue(fr.isStrike());
	}
	
	@Test
	public void test_isNotFirstThrowStrike() throws BowlingException {
		Frame fr = new Frame(2, 0);
		assertFalse(fr.isStrike());
	}
	
	@Test
	public void test_isSpare() throws BowlingException {
		Frame fr = new Frame(5, 5);
		assertTrue(fr.isSpare());
	}
	
	@Test
	public void test_isNotSpare() throws BowlingException {
		Frame fr = new Frame(5, 3);
		assertFalse(fr.isSpare());
	}
	
	@Test
	public void test_isScore() throws BowlingException {
		Frame fr = new Frame(5, 3);
		assertEquals("Is score: ", 8, fr.score());
	}
	
	@Test
	public void test_isNotScore() throws BowlingException {
		Frame fr = new Frame(5, 3);
		assertNotEquals("Is not score: ", 9, fr.score());
	}
	
	@Test
	public void test_isFrameAdded() throws BowlingException {
		BowlingGame game = new BowlingGame();
		
		Frame fr1 = new Frame(5, 3);
		Frame fr2 = new Frame(4, 4);
		Frame fr3 = new Frame(3, 6);
		
		game.addFrame(fr1);
		game.addFrame(fr2);
		game.addFrame(fr3);
		
	}
	
	@Test
	public void test_First1_Second4Score() throws BowlingException {
		BowlingGame game = new BowlingGame();
		
		Frame fr1 = new Frame(1, 4);
		
		assertEquals(5, game.score());
	}
	
	
	@Test
	public void test_First2_Second4Score() throws BowlingException {
		BowlingGame game = new BowlingGame();
		
		Frame fr1 = new Frame(2, 4);
		
		assertEquals(6, game.score());
	}
	
	
	@Test
	public void test_First1_Second2Score() throws BowlingException {
		BowlingGame game = new BowlingGame();
		
		Frame fr1 = new Frame(4, 5);
		
		assertEquals(9, game.score());
	}
	
	
	

	
	
	
	
	
	

}
