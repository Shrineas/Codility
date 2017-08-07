package codility.lesson3;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PermMissingElementTest {

	private PermMissingElement permMissingElement;

	@Before
	public void setup() {
		permMissingElement = new PermMissingElement();
	}

	@Test
	public void arrayWithTwoValues_InputAlreadySorted_ShouldReturnMissingElement() throws Exception {
		assertEquals(1, permMissingElement.solution(new int[] { 2, 3 }));
		assertEquals(2, permMissingElement.solution(new int[] { 1, 3 }));
		assertEquals(3, permMissingElement.solution(new int[] { 1, 2 }));
	}

	@Test
	public void arrayWithMultipleValues_InputAlreadySorted_ShouldReturnMissingElement() throws Exception {
		assertEquals(3, permMissingElement.solution(new int[] { 1, 2, 4, 5 }));
		assertEquals(1, permMissingElement.solution(new int[] { 2, 3, 4, 5 }));
		assertEquals(5, permMissingElement.solution(new int[] { 1, 2, 3, 4 }));
	}

	@Test
	public void arrayWithMultipleValues_InputUnsorted_ShouldReturnMissingElement() throws Exception {
		assertEquals(3, permMissingElement.solution(new int[] { 5, 1, 2, 4 }));
	}
}
