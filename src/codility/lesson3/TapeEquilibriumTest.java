package codility.lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TapeEquilibriumTest {

	private TapeEquilibrium tapeEquilibrium;

	@Before
	public void setup() {
		tapeEquilibrium = new TapeEquilibrium();
	}

	@Test
	public void arrayWithTwoValues_ShouldGiveDifferenceBetweenValues() throws Exception {
		assertEquals(2, tapeEquilibrium.solution(new int[] { 2, 4 }));
	}

	@Test
	public void arrayWithTwoValues_FirstHigherThanSecond_ShouldGiveAbsoluteDifferenceBetweenValues() throws Exception {
		assertEquals(2, tapeEquilibrium.solution(new int[] { 4, 2 }));
	}

	@Test
	public void arrayWithTwoValues_SameValue_ShouldReturnZero() throws Exception {
		assertEquals(0, tapeEquilibrium.solution(new int[] { 2, 2 }));
	}

	@Test
	public void arrayWithMultipleValues_ShouldReturnSmallestDifferenceBetweenTwoConsecutiveValues() throws Exception {
		assertEquals(2, tapeEquilibrium.solution(new int[] { 2, 8, 10 }));

		assertEquals(1, tapeEquilibrium.solution(new int[] { 3, 1, 2, 4, 3 }));
	}
}
