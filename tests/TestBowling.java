import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_isFirstThrowStrike() throws BowlingException {
		Frame fr = new Frame(10, 0);
		assertTrue(fr.isStrike());
	}
	
	@Test
	public void test_isNotFirstThrowStrike() {
		Frame fr = new Frame(2, 0);
		assertFalse(fr.isStrike());
	}
	
	@Test
	public void test_isSpare() {
		Frame fr = new Frame(5, 5);
		assertTrue(fr.isSpare());
	}
	
	@Test
	public void test_isNotSpare() {
		Frame fr = new Frame(5, 3);
		assertFalse(fr.isSpare());
	}
	
	@Test
	public void test_isScore() {
		Frame fr = new Frame(5, 3);
		assertEquals("Is score: ", 8, fr.score());
	}
	
	@Test
	public void test_isNotScore() {
		Frame fr = new Frame(5, 3);
		assertNotEquals("Is not score: ", 9, fr.score());
	}
	
	@Test
	public void test_isFrameAdded() {
		BowlingGame game = new BowlingGame();
		Frame fr = new Frame(5, 3);
		game.addFrame(fr);
		
	}
	
	
	

}
