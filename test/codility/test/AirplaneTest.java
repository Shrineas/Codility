package codility.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirplaneTest {
	private Airplane airplane;

	@Before
	public void setUp() throws Exception {
		airplane = new Airplane();
	}

	@Test
	public void emptyString_ReturnsThree() throws Exception {
		assertEquals(3, airplane.solution(1, ""));
	}

	@Test
	public void oneRowOneSeat_ReturnsTwo() throws Exception {
		assertEquals(2, airplane.solution(1, "1A"));
		assertEquals(2, airplane.solution(1, "1B"));
	}

	@Test
	public void oneRowOnlyOneBlockTaken_ReturnsTwo() throws Exception {
		assertEquals(2, airplane.solution(1, "1A 1B 1C"));
	}

	@Test
	public void multipleBlocksOccupied_ReturnsNumberOfFreeBlocks() throws Exception {
		assertEquals(5, airplane.solution(3, "1A 1D 1E 1G 2D 2J"));
	}
}
