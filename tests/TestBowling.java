import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test_isFirstThrowStrike() {
		Frame fr = new Frame(10, 0);
		assertTrue(fr.isStrike());
	}
	
	@Test
	public void test_isNotFirstThrowStrike() {
		Frame fr = new Frame(2, 0);
		assertFalse(fr.isStrike());
	}

}
